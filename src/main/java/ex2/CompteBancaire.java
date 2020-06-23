package ex2;

/**
 * Une Classe abstraite CompteBancaire
 * 
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;

	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Methode astraite prenant en paramétre montant et ajoute ce montant au solde
	 * 
	 * @param montant
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Methode astraite prenant en paramétre montant et diminue ce montant au solde
	 * en fonction du compte
	 * 
	 * @param montant
	 */
	public abstract void debiterMontant(double montant);

}
