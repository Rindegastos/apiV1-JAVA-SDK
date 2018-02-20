/**
 * Rindegastos.com Java SDK
 * Includes calls to the following methods:
 * getExpenses https://www.rindegastos.com/api/expense#pos-getExpenses
 * getExpense https://www.rindegastos.com/api/expense#pos-getExpense
 * getExpenseReports https://www.rindegastos.com/api/expenseReport#pos-getExpenseReports
 * getExpenseReport https://www.rindegastos.com/api/expenseReport#pos-getExpenseReport
 * getFunds https://www.rindegastos.com/api/funds#pos-getFunds
 * getFund https://www.rindegastos.com/api/funds#pos-getFund
 * createFund https://www.rindegastos.com/api/funds#pos-createFund
 * updateFund https://www.rindegastos.com/api/funds#pos-updateFund
 * depositMoneyToFund https://www.rindegastos.com/api/funds#pos-depositMoneyToFund
 * withdrawMoneyFromFund https://www.rindegastos.com/api/funds#pos-withdrawMoneyFromFund
 * setFundStatus https://www.rindegastos.com/api/funds#pos-setFundStatus
 * getExpensePolicies https://www.rindegastos.com/api/expensePolicies#pos-getExpensePolicies
 * getExpensePolicy https://www.rindegastos.com/api/expensePolicies#pos-getExpensePolicy
 * setExpenseIntegration https://www.rindegastos.com/api/expense#pos-setExpenseIntegration
 * setExpenseReportIntegration https://www.rindegastos.com/api/expenseReport#pos-setExpenseReportIntegration
 * getExpensePolicyExpenseReportFields https://www.rindegastos.com/api/expensePolicies#pos-getExpensePolicyExpenseReportFields
 * getExpensePolicyExpenseFields https://www.rindegastos.com/api/expensePolicies#pos-getExpensePolicyExpenseFields
 * getExpensePolicyCategories https://www.rindegastos.com/api/expensePolicies#pos-getExpensePolicyCategories
 * getExpensePolicyWorkflow https://www.rindegastos.com/api/expensePolicies#pos-getExpensePolicyWorkFlow
 * getExpensePolicyTaxes https://www.rindegastos.com/api/expensePolicies#pos-getExpensePolicyTaxes
 * getUsers https://www.rindegastos.com/api/users#pos-getUsers
 * getUser https://www.rindegastos.com/api/users#pos-getUser
 * setExpenseReportCustomStatus https://www.rindegastos.com/api/expenseReport#pos-setExpenseReportCustomStatus
 */

package rindegastosapi;

/**
 * @author Rindegastos
 */

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import javax.net.ssl.HttpsURLConnection;
import org.json.simple.JSONObject;

public class SdkRindegastos {
    
    private String token = "";

    public SdkRindegastos(String t) {
        //constructor
        //Definition of Token to access the different methods of the API Rindegatos
        token = t;
    }
    
    
    public void getExpenses(HashMap<String, String> paramsGetExpenses)  throws MalformedURLException, IOException  { //metodo que consume el servicio getExpense


            URL url = new URL("https://api.rindegastos.com/v1/getExpenses?"
                    + "Since=" + paramsGetExpenses.get("Since")
                    + "&Until=" + paramsGetExpenses.get("Until")
                    + "&Currency=" + paramsGetExpenses.get("Currency")
                    + "&Status=" + paramsGetExpenses.get("Status")
                    + "&Category=" + paramsGetExpenses.get("Category")
                    + "&ReportId=" + paramsGetExpenses.get("ReportId")
                    + "&ExpensePolicyId=" + paramsGetExpenses.get("ExpensePolicyId")
                    + "&IntegrationStatus=" + paramsGetExpenses.get("IntegrationStatus")
                    + "&IntegrationCode=" + paramsGetExpenses.get("IntegrationCode")
                    + "&IntegrationDate=" + paramsGetExpenses.get("IntegrationDate")
                    + "&UserId=" + paramsGetExpenses.get("UserId")
                    + "&OrderBy=" + paramsGetExpenses.get("OrderBy")
                    + "&Order=" + paramsGetExpenses.get("Order")
                    + "&ResultsPerPage=" + paramsGetExpenses.get("ResultsPerPage")
                    + "&Page=" + paramsGetExpenses.get("Page"));

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + token);
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

        
    }
    
    public void getExpense(HashMap<String, String> paramsGetExpense)  throws MalformedURLException, IOException  { //metodo que consume el servicio getExpense

            URL url = new URL("https://api.rindegastos.com/v1/getExpense?"
                    + "Id=" + paramsGetExpense.get("Id"));

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + token);
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

      

    }
    
    public void getExpenseReports(HashMap<String, String> paramsGetExpenseReports)  throws MalformedURLException, IOException  { //metodo que consume el servicio getExpense


            URL url = new URL("https://api.rindegastos.com/v1/getExpenseReports?"
                    + "Since=" + paramsGetExpenseReports.get("Since")
                    + "&Until=" + paramsGetExpenseReports.get("Until")
                    + "&TypeDateFilter=" + paramsGetExpenseReports.get("TypeDateFilter")
                    + "&Currency=" + paramsGetExpenseReports.get("Currency")
                    + "&Status=" + paramsGetExpenseReports.get("Status")
                    + "&ExpensePolicyId=" + paramsGetExpenseReports.get("Category")
                    + "&IntegrationStatus=" + paramsGetExpenseReports.get("IntegrationStatus")
                    + "&IntegrationCode=" + paramsGetExpenseReports.get("IntegrationCode")
                    + "&IntegrationDate=" + paramsGetExpenseReports.get("IntegrationDate")
                    + "&UserId=" + paramsGetExpenseReports.get("UserId")
                    + "&OrderBy=" + paramsGetExpenseReports.get("OrderBy")
                    + "&Order=" + paramsGetExpenseReports.get("Order")
                    + "&ResultsPerPage=" + paramsGetExpenseReports.get("ResultsPerPage")
                    + "&Page=" + paramsGetExpenseReports.get("Page"));

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + token);
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

       

    }
    
    public void getExpenseReport(HashMap<String, String> paramsGetExpenseReport)  throws MalformedURLException, IOException  { //metodo que consume el servicio getExpense

            URL url = new URL("https://api.rindegastos.com/v1/getExpenseReport?"
                    + "Id=" + paramsGetExpenseReport.get("Id"));

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + token);
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

    }
    
    public void getFunds(HashMap<String, String> paramsGetFunds)  throws MalformedURLException, IOException  { 


            URL url = new URL("https://api.rindegastos.com/v1/getFunds?"
                    + "Status=" + paramsGetFunds.get("Status")
                    + "&OrderBy=" + paramsGetFunds.get("OrderBy")
                    + "&Order=" + paramsGetFunds.get("Order")
                    + "&ResultsPerPage=" + paramsGetFunds.get("ResultsPerPage")
                    + "&Page=" + paramsGetFunds.get("Page"));

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + token);
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

      

    }
    
    public void getFund(HashMap<String, String> paramsGetFund) throws MalformedURLException, IOException  { 


            URL url = new URL("https://api.rindegastos.com/v1/getFund?"
                    + "Id=" + paramsGetFund.get("Id"));

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + token);
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

    }
    
    public void createFund(HashMap<String, String> paramsCreateFund) throws MalformedURLException, IOException {

        String url = "https://api.rindegastos.com/v1/createFund";
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        JSONObject objArray = new JSONObject();
        objArray.put("IdEmployee", paramsCreateFund.get("IdEmployee"));
        objArray.put("IdAdmin", paramsCreateFund.get("IdAdmin"));
        objArray.put("FundName", paramsCreateFund.get("FundName"));
        objArray.put("FundCurrency", paramsCreateFund.get("FundCurrency"));
        objArray.put("FundCode", paramsCreateFund.get("FundCode"));
        objArray.put("FundAmount", paramsCreateFund.get("FundAmount"));
        objArray.put("FundComment", paramsCreateFund.get("FundComment"));
        objArray.put("FundFlexibility", paramsCreateFund.get("FundFlexibility"));
        objArray.put("FundAutoDeposit", paramsCreateFund.get("FundAutoDeposit"));
        objArray.put("FundAutoBlock", paramsCreateFund.get("FundAutoBlock"));
        objArray.put("FundExpiration", paramsCreateFund.get("FundExpiration"));
        objArray.put("FundExpirationDate", paramsCreateFund.get("FundExpirationDate"));

        // Send post request
        con.setRequestProperty("Authorization", "Bearer " + token);
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(objArray.toJSONString());
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();

        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

    }
    
    public void updateFund(HashMap<String, String> paramsUpdateFund) throws MalformedURLException, IOException {

        String url = "https://api.rindegastos.com/v1/updateFund";
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("PUT");
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        JSONObject objArray = new JSONObject();
        objArray.put("Id", paramsUpdateFund.get("Id"));
        objArray.put("IdAdmin", paramsUpdateFund.get("IdAdmin"));
        objArray.put("FundName", paramsUpdateFund.get("FundName"));
        objArray.put("FundCode", paramsUpdateFund.get("FundCode"));
        objArray.put("FundComment", paramsUpdateFund.get("FundComment"));
        objArray.put("FundFlexibility", paramsUpdateFund.get("FundFlexibility"));
        objArray.put("FundAutoDeposit", paramsUpdateFund.get("FundAutoDeposit"));
        objArray.put("FundAutoBlock", paramsUpdateFund.get("FundAutoBlock"));
        objArray.put("FundExpiration", paramsUpdateFund.get("FundExpiration"));
        objArray.put("FundExpirationDate", paramsUpdateFund.get("FundExpirationDate"));

        // Send post request
        con.setRequestProperty("Authorization", "Bearer " + token);
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(objArray.toJSONString());
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();

        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

    }
    
    public void depositMoneyToFund(HashMap<String, String> paramsDepositFund) throws MalformedURLException, IOException {

        String url = "https://api.rindegastos.com/v1/depositMoneyToFund";
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        JSONObject objArray = new JSONObject();
        objArray.put("Id", paramsDepositFund.get("Id"));
        objArray.put("IdAdmin", paramsDepositFund.get("IdAdmin"));
        objArray.put("DepositAmount", paramsDepositFund.get("DepositAmount"));

        // Send post request
        con.setRequestProperty("Authorization", "Bearer " + token);
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(objArray.toJSONString());
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();

        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

    }
    
    public void withdrawMoneyFromFund(HashMap<String, String> paramsWithdrawFund) throws MalformedURLException, IOException {

        String url = "https://api.rindegastos.com/v1/withdrawMoneyFromFund";
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        JSONObject objArray = new JSONObject();
        objArray.put("Id", paramsWithdrawFund.get("Id"));
        objArray.put("IdAdmin", paramsWithdrawFund.get("IdAdmin"));
        objArray.put("WithdrawAmount", paramsWithdrawFund.get("WithdrawAmount"));

        // Send post request
        con.setRequestProperty("Authorization", "Bearer " + token);
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(objArray.toJSONString());
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();

        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

    }
    
    public void setFundStatus(HashMap<String, String> paramsSetFundStatus) throws MalformedURLException, IOException {

        String url = "https://api.rindegastos.com/v1/setFundStatus";
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("PUT");
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        JSONObject objArray = new JSONObject();
        objArray.put("Id", paramsSetFundStatus.get("Id"));
        objArray.put("IdAdmin", paramsSetFundStatus.get("IdAdmin"));
        objArray.put("FundStatus", paramsSetFundStatus.get("FundStatus"));

        // Send post request
        con.setRequestProperty("Authorization", "Bearer " + token);
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(objArray.toJSONString());
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();

        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

    }
    
    public void setExpenseIntegration(HashMap<String, String> paramsExpenseIntegration) throws MalformedURLException, IOException {

        String url = "https://api.rindegastos.com/v1/setExpenseIntegration";
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("PUT");
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        JSONObject objArray = new JSONObject();
        objArray.put("Id", paramsExpenseIntegration.get("Id"));
        objArray.put("IntegrationStatus", paramsExpenseIntegration.get("IntegrationStatus"));
        objArray.put("IntegrationCode", paramsExpenseIntegration.get("IntegrationCode"));
        objArray.put("IntegrationDate", paramsExpenseIntegration.get("IntegrationDate"));

        // Send post request
        con.setRequestProperty("Authorization", "Bearer " + token);
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(objArray.toJSONString());
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();

        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

    }
    
    public void setExpenseReportIntegration(HashMap<String, String> paramsExpenseReportIntegration) throws MalformedURLException, IOException {

        String url = "https://api.rindegastos.com/v1/setExpenseReportIntegration";
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("PUT");
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        JSONObject objArray = new JSONObject();
        objArray.put("Id", paramsExpenseReportIntegration.get("Id"));
        objArray.put("IntegrationStatus", paramsExpenseReportIntegration.get("IntegrationStatus"));
        objArray.put("IntegrationCode", paramsExpenseReportIntegration.get("IntegrationCode"));
        objArray.put("IntegrationDate", paramsExpenseReportIntegration.get("IntegrationDate"));

        // Send post request
        con.setRequestProperty("Authorization", "Bearer " + token);
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(objArray.toJSONString());
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();

        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

    }
     
    public void getExpensePolicies(HashMap<String, String> paramsGetExpensePolicies)  throws MalformedURLException, IOException  { //metodo que consume el servicio getExpense


            URL url = new URL("https://api.rindegastos.com/v1/getExpensePolicies?"
                    + "Status=" + paramsGetExpensePolicies.get("Status")
                    + "&OrderBy=" + paramsGetExpensePolicies.get("OrderBy")
                    + "&Order=" + paramsGetExpensePolicies.get("Order")
                    + "&ResultsPerPage=" + paramsGetExpensePolicies.get("ResultsPerPage")
                    + "&Page=" + paramsGetExpensePolicies.get("Page"));

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + token);
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

        
    }
    
    public void getExpensePolicy(HashMap<String, String> paramsGetExpensePolicy)  throws MalformedURLException, IOException  { //metodo que consume el servicio getExpense


            URL url = new URL("https://api.rindegastos.com/v1/getExpensePolicy?"
                    + "Id=" + paramsGetExpensePolicy.get("Id"));

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + token);
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

        
    }
    
    public void getExpensePolicyExpenseReportFields(HashMap<String, String> paramsGetExpensePolicyExpenseReportFields)  throws MalformedURLException, IOException  { //metodo que consume el servicio getExpense


            URL url = new URL("https://api.rindegastos.com/v1/getExpensePolicyExpenseReportFields?"
                    + "IdPolicy=" + paramsGetExpensePolicyExpenseReportFields.get("IdPolicy")
                    + "&OrderBy=" + paramsGetExpensePolicyExpenseReportFields.get("OrderBy")
                    + "&Order=" + paramsGetExpensePolicyExpenseReportFields.get("Order"));

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + token);
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

        
    }
    
    public void getExpensePolicyExpenseFields(HashMap<String, String> paramsGetExpensePolicyExpenseFields)  throws MalformedURLException, IOException  { //metodo que consume el servicio getExpense


            URL url = new URL("https://api.rindegastos.com/v1/getExpensePolicyExpenseFields?"
                    + "IdPolicy=" + paramsGetExpensePolicyExpenseFields.get("IdPolicy")
                    + "&OrderBy=" + paramsGetExpensePolicyExpenseFields.get("OrderBy")
                    + "&Order=" + paramsGetExpensePolicyExpenseFields.get("Order"));

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + token);
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

        
    }
    
    public void getExpensePolicyCategories(HashMap<String, String> paramsGetExpensePolicyCategories)  throws MalformedURLException, IOException  { //metodo que consume el servicio getExpense


            URL url = new URL("https://api.rindegastos.com/v1/getExpensePolicyCategories?"
                    + "IdPolicy=" + paramsGetExpensePolicyCategories.get("IdPolicy")
                    + "&OrderBy=" + paramsGetExpensePolicyCategories.get("OrderBy")
                    + "&Order=" + paramsGetExpensePolicyCategories.get("Order"));

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + token);
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

        
    }
    
    public void getExpensePolicyWorkflow(HashMap<String, String> paramsGetExpensePolicyWorkflow)  throws MalformedURLException, IOException  { //metodo que consume el servicio getExpense


            URL url = new URL("https://api.rindegastos.com/v1/getExpensePolicyWorkflow?"
                    + "IdPolicy=" + paramsGetExpensePolicyWorkflow.get("IdPolicy"));

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + token);
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

        
    }
    
    public void getExpensePolicyTaxes(HashMap<String, String> paramsGetExpensePolicyTaxes)  throws MalformedURLException, IOException  { //metodo que consume el servicio getExpense


            URL url = new URL("https://api.rindegastos.com/v1/getExpensePolicyTaxes?"
                    + "IdPolicy=" + paramsGetExpensePolicyTaxes.get("IdPolicy"));

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + token);
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

        
    }
    
    public void getUsers(HashMap<String, String> paramsGetUsers)  throws MalformedURLException, IOException  { //metodo que consume el servicio getExpense


            URL url = new URL("https://api.rindegastos.com/v1/getUsers?"
                    + "OrderBy=" + paramsGetUsers.get("OrderBy")
                    + "Order=" + paramsGetUsers.get("Order")
                    + "ResultsPerPage=" + paramsGetUsers.get("ResultsPerPage")
                    + "Page=" + paramsGetUsers.get("Page"));

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + token);
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

        
    }
    
    public void getUser(HashMap<String, String> paramsGetUser)  throws MalformedURLException, IOException  { //metodo que consume el servicio getExpense


            URL url = new URL("https://api.rindegastos.com/v1/getUser?"
                    + "Id=" + paramsGetUser.get("Id"));

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + token);
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

        
    }
    
    
    public void setExpenseReportCustomStatus(HashMap<String, String> paramsSetExpenseReportCustomStatus) throws MalformedURLException, IOException {

        String url = "https://api.rindegastos.com/v1/setExpenseReportCustomStatus";
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("PUT");
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        JSONObject objArray = new JSONObject();
        objArray.put("Id", paramsSetExpenseReportCustomStatus.get("Id"));
        objArray.put("IdAdmin", paramsSetExpenseReportCustomStatus.get("IdAdmin"));
        objArray.put("CustomStatus", paramsSetExpenseReportCustomStatus.get("CustomStatus"));
        objArray.put("CustomMessage", paramsSetExpenseReportCustomStatus.get("CustomMessage"));

        // Send post request
        con.setRequestProperty("Authorization", "Bearer " + token);
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(objArray.toJSONString());
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();

        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

    }
    

}
