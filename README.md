# SDK JAVA

El SDK JAVA de Rindegastos te permite rápidamente integrar tus servicios con Rindegastos. Con el SDK podrás autenticarte y consumir los métodos de la API según tus necesidades sin tener que desarrollar desde cero todo.

El SDK JAVA de Rindegastos entrega una mirada global de consumo para la API Rest.

#Instrucciones

Importante: recuerda que lo primero que debes hacer es tener el Token de Acceso a la API asignado como se indica aquí.

# Ejemplo de uso
Consumir los métodos de la API con el SDK es muy simple. A continuación te explicamos cómo hacerlo para usar el método getExpenses de la API.s

``` JAVA 
import java.io.IOException;
import java.util.HashMap;


public class RindegastosApi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        /**
         * Definition 'Token'
         */
        String TokenPass = "Your Token here!!";
        SdkRindegastos x = new SdkRindegastos(TokenPass);
        
        /**
         * Method getExpenses
         * definition of parameters to use in filter
         */
        HashMap<String,String> paramsGetExpenses = new HashMap<>();
        paramsGetExpenses.put("Since", "2017-10-01");
        paramsGetExpenses.put("Until", "2017-10-26");
        paramsGetExpenses.put("Currency", "CLP");
        paramsGetExpenses.put("Status", "1");
        paramsGetExpenses.put("Category", "");
        paramsGetExpenses.put("ReportId", "");
        paramsGetExpenses.put("ExpensePolicyId", "");
        paramsGetExpenses.put("IntegrationStatus", "");
        paramsGetExpenses.put("IntegrationCode", "");
        paramsGetExpenses.put("IntegrationDate", "");
        paramsGetExpenses.put("UserId", "");
        paramsGetExpenses.put("OrderBy", "");
        paramsGetExpenses.put("Order", "");
        paramsGetExpenses.put("ResultsPerPage", "");
        paramsGetExpenses.put("Page", "");
        
        //example calling method getExpenses
        x.getExpenses(paramsGetExpenses);
        /* End Method getExpenses
        */
	}
	
}		
		

```
