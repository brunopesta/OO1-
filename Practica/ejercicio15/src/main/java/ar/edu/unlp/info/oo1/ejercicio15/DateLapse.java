package ar.edu.unlp.info.oo1.ejercicio15;

import java.sql.Date;
import java.time.LocalDate;



public class DateLapse  {
	private LocalDate from;
	private LocalDate to;


public DateLapse(LocalDate from, LocalDate to) {
	this.to= to;
	this.from = from;
}

public LocalDate getFrom() {
	return this.from;
}
public LocalDate getTo() {
	return this.to; 	
}

public int sizeInDays() {
	return this.to.compareTo(this.from);
}



public boolean includesDate (LocalDate other) {
	return other.isAfter(this.getFrom()) && other.isBefore(this.getTo());
}

public boolean overlaps(DateLapse another) {
	
return  another.includesDate(this.getFrom()) || another.includesDate(getTo()) || another.equalsFrom(this.getFrom()) || another.equalsTo(this.getTo());
}

public boolean laterFrom() {
	return this.getFrom().isAfter(LocalDate.now());
}

public boolean equalsFrom(LocalDate another ) {
	return another.equals(getFrom());
}

public boolean equalsTo(LocalDate another) {
	return another.equals(this.getTo());
}

}