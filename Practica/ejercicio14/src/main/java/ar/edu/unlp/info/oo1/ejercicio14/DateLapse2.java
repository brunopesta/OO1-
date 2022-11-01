package ar.edu.unlp.info.oo1.ejercicio14;

import java.time.LocalDate;

public class DateLapse2 implements DateInter{
	private LocalDate from;
	private int sizeInDays;


public DateLapse2 (LocalDate from, int size) {
	this.from = from;
	this.sizeInDays = size;
}


public LocalDate getFrom() {
	return this.from;
}

public int getSizeInDays() {
	return this.sizeInDays;
}

public int sizeInDays() {
	return this.sizeInDays;
}

@Override
public boolean includesDate(LocalDate other) {
	return other.isAfter(from) && other.isBefore(getTo());
}


public LocalDate getTo() {
	return this.from.plusDays(sizeInDays);
}

}