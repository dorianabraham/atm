package fr.unilim.iut.atm;

public abstract class AbstractBankNote {
	@Override
	public boolean equals(Object other) {
		return this.toString().equals(other.toString());
	}
	@Override
	public int hashCode() {
		return this.toString().hashCode();
		
	}
}