/*
 * Rindegastos.com Java SDK
 */

package rindegastosapi;

import java.io.IOException;
import java.util.HashMap;

/**
 * @author Rindegastos
 */

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
        
        /**
         * Method getExpense
         * definition of parameters to use in filter
        HashMap<String,String> paramsGetExpense = new HashMap<>();
        paramsGetExpense.put("Id", "884558");//Id único del gasto que se desea obtener.
        
        //example calling method getExpenses
        x.getExpense(paramsGetExpense);
        /* End Method getExpense
        */
        
        /*
         *Method setExpenseIntegration
        //definition of parameters to setExpenseIntegration
        HashMap<String,String> paramsSetExpenseIntegration = new HashMap<>();
        paramsSetExpenseIntegration.put("Id", "893070");
        paramsSetExpenseIntegration.put("IntegrationStatus", "1");
        paramsSetExpenseIntegration.put("IntegrationCode", "111111");
        paramsSetExpenseIntegration.put("IntegrationDate", "2017-06-10");
        
        //example calling method setExpenseIntegration
        x.setExpenseIntegration(paramsSetExpenseIntegration);
        /* End Method createFund
        */
        
        
        
        
        /*
         *Method getExpenseReports
        //definition of parameters to use in filter
        HashMap<String,String> paramsGetExpenseReports = new HashMap<>();
        paramsGetExpenseReports.put("Since", "2017-10-01");
        paramsGetExpenseReports.put("Until", "2017-10-30");
        paramsGetExpenseReports.put("TypeDateFilter", "1");
        paramsGetExpenseReports.put("Currency", "");
        paramsGetExpenseReports.put("Status", "1");
        paramsGetExpenseReports.put("ExpensePolicyId", "");
        paramsGetExpenseReports.put("IntegrationStatus", "");
        paramsGetExpenseReports.put("IntegrationCode", "");
        paramsGetExpenseReports.put("IntegrationDate", "");
        paramsGetExpenseReports.put("UserId", "");
        paramsGetExpenseReports.put("OrderBy", "");
        paramsGetExpenseReports.put("Order", "");
        paramsGetExpenseReports.put("ResultsPerPage", "");
        paramsGetExpenseReports.put("Page", "");
        
        //example calling method getExpenseReports
        x.getExpenseReports(paramsGetExpenseReports);
        /*End Method getExpenseReports
        */
        
        /*
         *Method getExpenseReport
        //definition of parameters to use in filter
        HashMap<String,String> paramsGetExpenseReport = new HashMap<>();
        paramsGetExpenseReport.put("Id", "125417");
        
        //example calling method getExpenseReport
        x.getExpenseReport(paramsGetExpenseReport);
        /* End Method getExpenseReport
        */
        
        /*
         *Method setExpenseReportIntegration
        //definition of parameters to setExpenseReportIntegration
        HashMap<String,String> paramsSetExpenseReportIntegration = new HashMap<>();
        paramsSetExpenseReportIntegration.put("Id", "138712");
        paramsSetExpenseReportIntegration.put("IntegrationStatus", "1");
        paramsSetExpenseReportIntegration.put("IntegrationCode", "2222");
        paramsSetExpenseReportIntegration.put("IntegrationDate", "2017-06-10");
        
        //example calling method setExpenseIntegration
        x.setExpenseReportIntegration(paramsSetExpenseReportIntegration);
        /* End Method createFund
        */
        
        
        /*
         *Method getFunds
        //definition of parameters to use in filter
        HashMap<String,String> paramsGetFunds = new HashMap<>();
        paramsGetFunds.put("Status", "1");
        paramsGetFunds.put("OrderBy", "");
        paramsGetFunds.put("Order", "");
        paramsGetFunds.put("ResultsPerPage", "");
        paramsGetFunds.put("Page", "");
        
        //example calling method getFunds
        x.getFunds(paramsGetFunds);
        * End Method getFunds
        */
        
        /*
         *Method getFund
        //definition of parameters to use in filter
        HashMap<String,String> paramsGetFund = new HashMap<>();
        paramsGetFund.put("Id", "4339");
        
        //example calling method getFund
        x.getFund(paramsGetFund);
        /* End Method getFund
        */
        
        /*
         *Method createFund
        //definition of parameters to create
        HashMap<String,String> paramsCreateFund = new HashMap<>();
        paramsCreateFund.put("IdEmployee", "61");
        paramsCreateFund.put("IdAdmin", "61");
        paramsCreateFund.put("FundName", "YYX Fund 2");
        paramsCreateFund.put("FundCurrency", "CLP");
        paramsCreateFund.put("FundCode", "001");
        paramsCreateFund.put("FundAmount", "10000");
        paramsCreateFund.put("FundComment", "Testing");
        paramsCreateFund.put("FundFlexibility", "1");
        paramsCreateFund.put("FundAutoDeposit", "1");
        paramsCreateFund.put("FundAutoBlock", "1");
        paramsCreateFund.put("FundExpiration", "1");
        paramsCreateFund.put("FundExpirationDate", "2017-01-12");
        
        //example calling method createFund
        x.createFund(paramsCreateFund);
        /* End Method createFund
        */
        
        
        /*
         *Method updateFund
        //definition of parameters to update
        HashMap<String,String> paramsUpdateFund = new HashMap<>();
        paramsUpdateFund.put("Id", "4344");
        paramsUpdateFund.put("IdAdmin", "61");
        paramsUpdateFund.put("FundName", "Nuevo Name");
        paramsUpdateFund.put("FundCode", "001");
        paramsUpdateFund.put("FundComment", "Testing");
        paramsUpdateFund.put("FundFlexibility", "1");
        paramsUpdateFund.put("FundAutoDeposit", "1");
        paramsUpdateFund.put("FundAutoBlock", "1");
        paramsUpdateFund.put("FundExpiration", "1");
        paramsUpdateFund.put("FundExpirationDate", "2017-10-12");
        
        //example calling method updateFund
        x.updateFund(paramsUpdateFund);
        /* End Method updateFund
        */
        
        /*
         *Method depositMoneyToFund
        //definition of parameters to depositMoneyToFund
        HashMap<String,String> paramsDepositFund = new HashMap<>();
        paramsDepositFund.put("Id", "4344");
        paramsDepositFund.put("IdAdmin", "61");
        paramsDepositFund.put("DepositAmount", "10000");
        
        //example calling method depositMoneyToFund
        x.depositMoneyToFund(paramsDepositFund);
        /* End Method depositMoneyToFund
        */
        
        /*
         *Method withdrawMoneyFromFund
        //definition of parameters to withdrawMoneyFromFund
        HashMap<String,String> paramsWithdrawFund = new HashMap<>();
        paramsWithdrawFund.put("Id", "4344");
        paramsWithdrawFund.put("IdAdmin", "61");
        paramsWithdrawFund.put("WithdrawAmount", "10000");
        
        //example calling method withdrawMoneyFromFund
        x.withdrawMoneyFromFund(paramsWithdrawFund);
        /* End Method withdrawMoneyFromFund
        */
        
        /*
         *Method setFundStatus
        //definition of parameters to setFundStatus
        HashMap<String,String> paramsSetFundStatus = new HashMap<>();
        paramsSetFundStatus.put("Id", "4344");
        paramsSetFundStatus.put("IdAdmin", "61");
        paramsSetFundStatus.put("FundStatus", "1");
        
        //example calling method createFund
        x.setFundStatus(paramsSetFundStatus);
        /* End Method createFund
        */
        
        /*
         *Method getExpensePolicies
        //definition of parameters to getExpensePolicies
        HashMap<String,String> paramsGetExpensePolicies = new HashMap<>();
        paramsGetExpensePolicies.put("Status", "1");
        paramsGetExpensePolicies.put("OrderBy", "1");
        paramsGetExpensePolicies.put("Order", "ASC");
        paramsGetExpensePolicies.put("ResultsPerPage", "");
        paramsGetExpensePolicies.put("Page", "");
        
        //example calling method getExpensePolicies
        x.getExpensePolicies(paramsGetExpensePolicies);
        /* End Method getExpensePolicies
        */
        
        
        /*
         *Method getExpensePolicy
        //definition of parameters to getExpensePolicy
        HashMap<String,String> paramsGetExpensePolicy = new HashMap<>();
        paramsGetExpensePolicy.put("Id", "4044");
        
        //example calling method getExpensePolicy
        x.getExpensePolicy(paramsGetExpensePolicy);
        /* End Method getExpensePolicy
        */
        
        /*
         *Method getExpensePolicyExpenseReportFields
        //definition of parameters to getExpensePolicyExpenseReportFields
        HashMap<String,String> paramsGetExpensePolicyExpenseReportFields = new HashMap<>();
        paramsGetExpensePolicyExpenseReportFields.put("IdPolicy", "4044");
        paramsGetExpensePolicyExpenseReportFields.put("OrderBy", "1");
        paramsGetExpensePolicyExpenseReportFields.put("Order", "ASC");
        
        //example calling method getExpensePolicyExpenseReportFields
        x.getExpensePolicyExpenseReportFields(paramsGetExpensePolicyExpenseReportFields);
        /* End Method getExpensePolicyExpenseReportFields
        */
        
        
        /*
         *Method getExpensePolicyExpenseFields
        //definition of parameters to getExpensePolicyExpenseFields
        HashMap<String,String> paramsGetExpensePolicyExpenseFields = new HashMap<>();
        paramsGetExpensePolicyExpenseFields.put("IdPolicy", "4044");
        paramsGetExpensePolicyExpenseFields.put("OrderBy", "1");
        paramsGetExpensePolicyExpenseFields.put("Order", "ASC");
        
        //example calling method getExpensePolicyExpenseFields
        x.getExpensePolicyExpenseFields(paramsGetExpensePolicyExpenseFields);
        /* End Method getExpensePolicyExpenseFields
        */
        
        
        /*
         *Method getExpensePolicyCategories
        //definition of parameters to getExpensePolicyExpenseFields
        HashMap<String,String> paramsGetExpensePolicyCategories = new HashMap<>();
        paramsGetExpensePolicyCategories.put("IdPolicy", "4044");
        paramsGetExpensePolicyCategories.put("OrderBy", "1");
        paramsGetExpensePolicyCategories.put("Order", "ASC");
        
        //example calling method getExpensePolicyCategories
        x.getExpensePolicyCategories(paramsGetExpensePolicyCategories);
        /* End Method getExpensePolicyCategories
        */
        
        
        /*
         *Method getExpensePolicyWorkflow
        //definition of parameters to getExpensePolicyWorkflow
        HashMap<String,String> paramsGetExpensePolicyWorkflow = new HashMap<>();
        paramsGetExpensePolicyWorkflow.put("IdPolicy", "4044");
        
        //example calling method getExpensePolicyWorkflow
        x.getExpensePolicyWorkflow(paramsGetExpensePolicyWorkflow);
        /* End Method getExpensePolicyWorkflow
        */
        
        /*
         *Method getExpensePolicyTaxes
        //definition of parameters to getExpensePolicyTaxes
        HashMap<String,String> paramsGetExpensePolicyTaxes = new HashMap<>();
        paramsGetExpensePolicyTaxes.put("IdPolicy", "4044");
        
        //example calling method getExpensePolicyTaxes
        x.getExpensePolicyTaxes(paramsGetExpensePolicyTaxes);
        /* End Method getExpensePolicyTaxes
        */
        
        
        /*
         *Method getUsers
        //definition of parameters to getUsers
        HashMap<String,String> paramsGetUsers = new HashMap<>();
        paramsGetUsers.put("OrderBy", "1");
        paramsGetUsers.put("Order", "ASC");
        paramsGetUsers.put("ResultsPerPage", "");
        paramsGetUsers.put("Page", "");
        
        //example calling method getUsers
        x.getUsers(paramsGetUsers);
        /* End Method getUsers
        */
        
        /*
         *Method getUser
        //definition of parameters to getUser
        HashMap<String,String> paramsGetUser = new HashMap<>();
        paramsGetUser.put("Id", "61");
        
        //example calling method getUser
        x.getUser(paramsGetUser);
        /* End Method getUser
        */
        
    }
    
}
