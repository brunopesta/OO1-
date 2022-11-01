package ar.edu.unlp.info.oo1.ejercicio14;

import java.time.LocalDate;

public class DateLapse implements DateInter {
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


}