package com.konfigthis.client;

import com.konfigthis.client.api.AccountAccessApi;
import com.konfigthis.client.api.AccountsApi;
import com.konfigthis.client.api.BalancesApi;
import com.konfigthis.client.api.BeneficiariesApi;
import com.konfigthis.client.api.DirectDebitsApi;
import com.konfigthis.client.api.OffersApi;
import com.konfigthis.client.api.PartiesApi;
import com.konfigthis.client.api.ProductsApi;
import com.konfigthis.client.api.ScheduledPaymentsApi;
import com.konfigthis.client.api.StandingOrdersApi;
import com.konfigthis.client.api.StatementsApi;
import com.konfigthis.client.api.TransactionsApi;

public class OpenBanking {
    private ApiClient apiClient;
    public final AccountAccessApi accountAccess;
    public final AccountsApi accounts;
    public final BalancesApi balances;
    public final BeneficiariesApi beneficiaries;
    public final DirectDebitsApi directDebits;
    public final OffersApi offers;
    public final PartiesApi parties;
    public final ProductsApi products;
    public final ScheduledPaymentsApi scheduledPayments;
    public final StandingOrdersApi standingOrders;
    public final StatementsApi statements;
    public final TransactionsApi transactions;

    public OpenBanking() {
        this(null);
    }

    public OpenBanking(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.accountAccess = new AccountAccessApi(this.apiClient);
        this.accounts = new AccountsApi(this.apiClient);
        this.balances = new BalancesApi(this.apiClient);
        this.beneficiaries = new BeneficiariesApi(this.apiClient);
        this.directDebits = new DirectDebitsApi(this.apiClient);
        this.offers = new OffersApi(this.apiClient);
        this.parties = new PartiesApi(this.apiClient);
        this.products = new ProductsApi(this.apiClient);
        this.scheduledPayments = new ScheduledPaymentsApi(this.apiClient);
        this.standingOrders = new StandingOrdersApi(this.apiClient);
        this.statements = new StatementsApi(this.apiClient);
        this.transactions = new TransactionsApi(this.apiClient);
    }

}
