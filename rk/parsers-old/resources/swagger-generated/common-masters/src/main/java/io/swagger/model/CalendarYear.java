package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;




/**
 * CalendarYear
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:20:22.652+05:30")

public class CalendarYear   {
  private Long id = null;

  private Integer name = null;

  private LocalDate startDate = null;

  private LocalDate endDate = null;

  private Boolean active = null;

  public CalendarYear id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the calendar.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the calendar.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CalendarYear name(Integer name) {
    this.name = name;
    return this;
  }

   /**
   * Unique Name of the year. For example 2000, 2017 etc.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Unique Name of the year. For example 2000, 2017 etc.")
  public Integer getName() {
    return name;
  }

  public void setName(Integer name) {
    this.name = name;
  }

  public CalendarYear startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Starting date of the year. It should be always January 1st.
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "Starting date of the year. It should be always January 1st.")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public CalendarYear endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Last date of the year. It should be always December 31st.
   * @return endDate
  **/
  @ApiModelProperty(required = true, value = "Last date of the year. It should be always December 31st.")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public CalendarYear active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * if this year is active then value will be TRUE, else value will be FALSE.
   * @return active
  **/
  @ApiModelProperty(required = true, value = "if this year is active then value will be TRUE, else value will be FALSE.")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarYear calendarYear = (CalendarYear) o;
    return Objects.equals(this.id, calendarYear.id) &&
        Objects.equals(this.name, calendarYear.name) &&
        Objects.equals(this.startDate, calendarYear.startDate) &&
        Objects.equals(this.endDate, calendarYear.endDate) &&
        Objects.equals(this.active, calendarYear.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, startDate, endDate, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarYear {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

