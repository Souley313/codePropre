/**
 * 
 */
package ex2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author formation
 *
 */
public class CompteCourant extends CompteBancaire {

	private static final Logger LOG = LoggerFactory.getLogger(CompteCourant.class);

	private double decouvert;

	/**
	 * Constructeur de Compte courant
	 * 
	 * @param solde
	 * @param decouvert
	 * 
	 */
	public CompteCourant(double solde, double decouvert) {
		this.solde = solde;
		this.decouvert = decouvert;
	}

	/**
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public void debiterMontant(double montant) {
		if (montant > this.solde + decouvert) {
			LOG.info("Vous avez dépassé votre découvert autorisé");
		} else if (this.solde - montant > decouvert) {
			this.solde = solde - montant;
		} else {
			this.solde = (solde - montant);
		}

	}

	@Override
	public String toString() {
		return "CompteCourant: decouvert = " + decouvert + ", solde = " + solde;
	}

}
