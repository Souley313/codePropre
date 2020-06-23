package ex2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Classe Représentant un compte bancaire de type LivretA
 * 
 * @author DIGINAMIC
 */
public class LivretA extends CompteBancaire {

	private static final Logger LOG = LoggerFactory.getLogger(LivretA.class);

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * Constructeur de Livret A
	 * 
	 * @param solde
	 * @param tauxRemuneration
	 * 
	 */
	public LivretA(double solde, double tauxRemuneration) {
		this.solde = solde;
		this.tauxRemuneration = tauxRemuneration;
	}

	public void debiterMontant(double montant) {
		if (this.solde - montant >= 0) {
			this.solde = solde - montant;
		} else {
			LOG.info("le montant n'est pas autorisé");
		}
	}

	public void appliquerRemuAnnuelle() {
		this.solde = (solde + (solde * (tauxRemuneration / 100)));
	}

	/**
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public String toString() {
		return "LivretA: tauxRemuneration = " + tauxRemuneration + ", solde = " + solde;
	}

}
