package com.css.mop;

public class InstrumentPerson {
	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	private String personName;
	void testPlay(Instrument iu){
	iu.play();	
	}
	
}
