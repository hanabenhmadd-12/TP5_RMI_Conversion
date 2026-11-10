package rmiServer;
import rmiService.ConversionImpl;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class ConversionServer {
    public static void main(String[] args) {
        try {
            // i. Activer l'annuaire RMIRegistry (port 1099)
            Registry registry = LocateRegistry.createRegistry(1099);
            System.out.println("RMIRegistry démarré sur le port 1099");

            // ii. Créer l'instance du service
            ConversionImpl service = new ConversionImpl();

            // iii. Publier la référence dans l'annuaire
            registry.rebind("ConversionService", service);
            System.out.println("Service 'ConversionService' publié. Serveur prêt...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
