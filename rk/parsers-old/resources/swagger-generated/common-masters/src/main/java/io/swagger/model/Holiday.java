package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;




/**
 * Holiday
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:20:22.652+05:30")

public class Holiday   {
  private Long id = null;

  private Object calendarYear = null;

  private String name = null;

  private LocalDate applicableOn = null;

  public Holiday id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the holiday list.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the holiday list.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Holiday calendarYear(Object calendarYear) {
    this.calendarYear = calendarYear;
    return this;
  }

   /**
   * Year for which the holiday belongs to.
   * @return calendarYear
  **/
  @ApiModelProperty(required = true, value = "Year for which the holiday belongs to.")
  public Object getCalendarYear() {
    return calendarYear;
  }

  public void setCalendarYear(Object calendarYear) {
    this.calendarYear = calendarYear;
  }

  public Holiday name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the holiday, for example Diwali, Ramzan etc.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the holiday, for example Diwali, Ramzan etc.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Holiday applicableOn(LocalDate applicableOn) {
    this.applicableOn = applicableOn;
    return this;
  }

   /**
   * Date on which the holiday is applicable.
   * @return applicableOn
  **/
  @ApiModelProperty(required = true, value = "Date on which the holiday is applicable.")
  public LocalDate getApplicableOn() {
    return applicableOn;
  }

  public void setApplicableOn(LocalDate applicableOn) {
    this.applicableOn = applicableOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Holiday holiday = (Holiday) o;
    return Objects.equals(this.id, holiday.id) &&
        Objects.equals(this.calendarYear, holiday.calendarYear) &&
        Objects.equals(this.name, holiday.name) &&
        Objects.equals(this.applicableOn, holiday.applicableOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, calendarYear, name, applicableOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Holiday {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    calendarYear: ").append(toIndentedString(calendarYear)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    applicableOn: ").append(toIndentedString(applicableOn)).append("\n");
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

