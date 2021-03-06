package com.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nefariouszhen.dropwizard.assets.AssetsBundleConfiguration;
import com.nefariouszhen.dropwizard.assets.AssetsConfiguration;
import io.dropwizard.Configuration;
import io.dropwizard.client.JerseyClientConfiguration;
import io.dropwizard.db.DataSourceFactory;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class PetStoreConfiguration extends Configuration implements AssetsBundleConfiguration {

    @Valid
    @NotNull
    @JsonProperty
    private DataSourceFactory dataSource = new DataSourceFactory();

    @Valid
    @NotNull
    @JsonProperty
    private JerseyClientConfiguration client = new JerseyClientConfiguration();

    public DataSourceFactory getDataSource() {
        return dataSource;
    }

    public JerseyClientConfiguration getClient() {
        return client;
    }

    @Valid
    @NotNull
    @JsonProperty
    private final AssetsConfiguration assets = new AssetsConfiguration();

    @Override
    public AssetsConfiguration getAssetsConfiguration() {
        return assets;
    }
}
