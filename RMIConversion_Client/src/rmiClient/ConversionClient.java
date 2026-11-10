package rmiClient;

import rmiService.IConversion;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ConversionClient {
    public static void main(String[] args) {
        try {
            // ii. Chercher la référence dans l'annuaire
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            IConversion stub = (IConversion) registry.lookup("ConversionService");

            // iii. Invoquer la méthode distante
            double resultat = stub.convertirMontant(500);
            System.out.println("500 EUR = " + resultat + " TND");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}