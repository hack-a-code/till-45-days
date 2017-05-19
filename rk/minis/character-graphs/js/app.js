"use strict";

var data = [];
var inputElement;
var config = {};
var tooltip;
var g;

function updateDataSet() {
    inputElement = $('#text-input').val();
    data = inputElement.toUpperCase().split('');
    var newData = [],
        bar = [],
        pie = [];
    var occurance = 0,
        frequency = 0,
        total = data.length,
        vowels = 0,
        consonants = 0,
        numbers = 0,
        special = 0;
    var isPresent = false;

    data.forEach(function (selected) {
        occurance = 0;
        frequency = 0;
        isPresent = false;
        data.forEach(function (element) {
            if (selected === element) {
                occurance++;
                frequency = occurance / total;
            }
        });
        if (occurance > 1) {
            bar.forEach(function (d) {
                if (d.letter === selected) {
                    isPresent = true;
                }
            });
        }
        if (!isPresent) {
            if ((selected >= 'a' && selected <= 'z') || (selected >= 'A' && selected <= 'Z')) {
                bar.push({
                    letter: selected,
                    occurance: occurance,
                    frequency: frequency
                });
            }
        }
        if (selected == 'A' || selected == 'E' || selected == 'I' || selected == 'O' || selected == 'U')
            vowels++;
        else if (selected >= 'A' && selected <= 'Z')
            consonants++;
        else if (selected >= '0' && selected <= '9')
            numbers++;
        else
            special++;
    });

    pie.push({
        label: 'Vowels',
        count: vowels,
        percent: Math.round((vowels / total) * 100)
    }, {
        label: 'Consonants',
        count: consonants,
        percent: Math.round((consonants / total) * 100)
    }, {
        label: 'Digits',
        count: numbers,
        percent: Math.round((numbers / total) * 100)
    }, {
        label: 'Sp. Chars',
        count: special,
        percent: Math.round((special / total) * 100)
    });
    newData.bar = bar;
    newData.pie = pie;
    newData.total = total;

    data = newData;
    config = {
        container: 'svg',
        data: data,
        width: 900,
        height: 450,
        margin: {
            top: 20,
            right: 20,
            bottom: 50,
            left: 40
        }
    };

    if (data.total != 0) {
        var barChart = Chart('bar', config);
        var pieChart = Chart('pie', config);
    } else {
        emptyChart();
    }
}

function barChart(config) {
    var oWidth = config.width || 720, // default width
        oHeight = config.height || 360, // default height
        width = oWidth - (config.margin.left || 40) - (config.margin.right || 20),
        height = oHeight - (config.margin.top || 20) - (config.margin.bottom || 30),
        margin = config.margin,
        svg = null,
        radius = Math.min(oWidth, oHeight) / 2,
        donutWidth = 75,
        data = config.data.bar || '';

    function draw() {
        if (this instanceof d3.selection) {
            svg = this.select(config.container);
        }

        svg.attr('width', oWidth)
            .attr('height', oHeight);

        var x = d3.scaleBand().rangeRound([0, width]).padding(0.1),
            y = d3.scaleLinear().rangeRound([height, 0]);

        x.domain(data.map(function (d) {
            return d.letter;
        }));
        y.domain([0, d3.max(data, function (d) {
            return d.frequency;
        })]);

        if (svg.selectAll('g').empty()) {
            g = svg.append('g')
                .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

            g.append("g")
                .attr("class", "axis axis--x")
                .attr("transform", "translate(0," + height + ")");

            g.append("g")
                .attr("class", "axis axis--y");

            d3.selectAll('.isVisible')
                .attr('style', 'visibility: visible;');
        } else {
            g = svg.select('g');
        }

        g.select('.axis--x')
            .call(d3.axisBottom(x));

        g.select('.axis--y')
            .call(d3.axisLeft(y).ticks(10, "%"));

        g.append("text")
            .attr("transform", "rotate(-90)")
            .attr("y", 5)
            .attr("dy", "0.71em")
            .attr("text-anchor", "end")
            .text("Frequency");

        g.append("text")
            .attr("x", (width + config.margin.left) / 2)
            .attr("dx", "0.71em")
            .attr("y", height + 25)
            .attr("dy", "0.71em")
            .attr("text-anchor", "end")
            .text("Characters");

        var bar = g.selectAll(".bar");

        bar.data(data)
            .enter()
            .append("rect")
            .attr("class", "bar");

        var tip = d3.tip()
            .attr('class', 'd3-tip')
            .offset([-10, 0])
            .html(function (d) {
                console.log('tip d:', d);
                return "<div style='text-align: center;'><h4 style='border-bottom: 2px solid white;'><strong>" + d.letter + "</strong></h4>Total : " + d.occurance + "<br>" + Math.round(d.frequency * 100) + "%</div>";
            });

        g.call(tip);

        bar.transition()
            .duration(1000)
            .delay(100)
            .ease(d3.easeLinear)
            .attr("x", function (d) {
                return x(d.letter);
            })
            .attr("y", function (d) {
                return y(d.frequency);
            })
            .attr("width", x.bandwidth())
            .attr("height", function (d) {
                return height - y(d.frequency);
            });

        bar.on('mouseover', tip.show)
            .on('mouseout', tip.hide);

        bar.exit().remove();
    }

    draw.width = function (value) {
        if (!arguments.length) return oWidth;
        oWidth = value;
        width = oWidth - (config.margin.left || 40) - (config.margin.right || 20);
        return draw;
    };

    draw.height = function (value) {
        if (!arguments.length) return oHeight;
        oHeight = value;
        height = oHeight - (config.margin.top || 20) - (config.margin.bottom || 30);
        return draw;
    };

    return draw;
}


function pieChart(config) {
    var width = config.width || 720, // default width
        height = config.height || 450, // default height
        svg = null,
        radius = Math.min(width, height) / 2,
        donutWidth = radius / 5,
        legendRectSize = config.legendRectSize || 18,
        legendSpacing = config.legendSpacing || 4,
        data = config.data.pie || '';

    var color = d3.scaleOrdinal(d3.schemeCategory20c);

    function draw() {
        if (this instanceof d3.selection) {
            svg = this.select(config.container);
        }

        console.log('r: ', radius);
        svg.attr('width', width)
            .attr('height', height);

        var tip;

        if (svg.selectAll('g').empty()) {
            g = svg.append('g')
                .attr('transform', 'translate(' + (width / 2) + ',' + (height / 2) + ')');
        } else {
            g = svg.select('g');
        }

        tip = d3.tip()
            .attr('class', 'd3-tip')
            .offset([-10, 0])
            .html(function (d) {
                console.log('tip d:', d);
                return "<div style='text-align: center;'><h5 style='border-bottom: 2px solid white;'><strong>" + d.data.label + "</strong></h5>Total : " + d.data.count + "<br>" + d.data.percent + "%</div>";
            });
        g.call(tip);

        var arc = d3.arc()
            .innerRadius(radius - donutWidth)
            .outerRadius(radius);

        var pie = d3.pie()
            .value(function (d) {
                return d.count;
            })
            .sort(null);

        data.forEach(function (d) {
            d.count = +d.count;
            d.enabled = true;
        });
        console.log('data:', data);

        var path = g.selectAll('path');

        path.data(pie(data))
            .enter()
            .append('path');

        path.transition()
            .duration(750)
            .attr('d', arc)
            .attr('fill', function (d, i) {
                return color(d.data.label);
            })
            .each(function (d) {
                this._current = d;
            });

        path.on('mouseover', tip.show)
            .on('mouseout', tip.hide);

        var legend = g.selectAll('.legend')
            .data(color.domain())
            .enter()
            .append('g')
            .attr('class', 'legend');

        legend.attr('transform', function (d, i) {
            var height = legendRectSize + legendSpacing;
            var offset = height * color.domain().length / 2;
            var horz = -2 * legendRectSize;
            var vert = i * height - offset;
            return 'translate(' + horz + ',' + vert + ')';
        });

        legend.append('rect')
            .attr('width', legendRectSize)
            .attr('height', legendRectSize)
            .style('fill', color)
            .style('stroke', color)
            .on('click', function (label) {
                var rect = d3.select(this);
                var enabled = true;
                var totalEnabled = d3.sum(data.map(function (d) {
                    return (d.enabled) ? 1 : 0;
                }));

                if (rect.attr('class') === 'disabled') {
                    rect.attr('class', '');
                } else {
                    if (totalEnabled < 2) return;
                    rect.attr('class', 'disabled');
                    enabled = false;
                }

                pie.value(function (d) {
                    if (d.label === label) d.enabled = enabled;
                    return (d.enabled) ? d.count : 0;
                });

                path = path.data(pie(data));

                path.transition()
                    .duration(750)
                    .delay(100)
                    .ease(d3.easeLinear)
                    .attrTween('d', function (d) {
                        var interpolate = d3.interpolate(this._current, d);
                        this._current = interpolate(0);
                        return function (t) {
                            return arc(interpolate(t));
                        };
                    });
            });

        legend.append('text')
            .attr('x', legendRectSize + legendSpacing)
            .attr('y', legendRectSize - legendSpacing)
            .text(function (d) {
                return d;
            });
    }

    draw.width = function (value) {
        if (!arguments.length) return width;
        width = value;
        radius = Math.min(width, height) / 2;
        donutWidth = radius / 5;
        return draw;
    };

    draw.height = function (value) {
        if (!arguments.length) return height;
        height = value;
        radius = Math.min(width, height) / 2;
        donutWidth = radius / 5;
        return draw;
    };

    draw.donutWidth = function (value) {
        if (!arguments.length) return donutWidth;
        donutWidth = value;
        return draw;
    };

    return draw;
}


function emptyChart() {
    d3.selectAll('#chart-wrapper').attr('style', 'visibility: hidden;');
    d3.selectAll('.isVisible').attr('style', 'visibility: hidden;');
}


function Chart(type, config) {
    var myChart;
    var selection = d3.select('#' + type + '-chart');
    d3.selectAll('#chart-wrapper').attr('style', 'visibility: visible;');
    if (selection.select(config.container).empty()) {
        selection.append(config.container);
    }
    console.log('selection', selection);
    switch (type) {
        case 'bar':
            myChart = barChart(config).width(540)
                .height(270);
            myChart.call(selection);
            break;

        case 'pie':
            myChart = pieChart(config).width(225)
                .height(225)
                .donutWidth(36);
            myChart.call(selection);
            break;
    }
    return myChart;
}
