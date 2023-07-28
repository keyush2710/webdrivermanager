package io.github.bonigarcia.wdm.docker;

import io.github.bonigarcia.wdm.config.DriverManagerType;

public class DockerImageParameters {
    private DriverManagerType driverManagerType;
    private String cacheKey;
    private String browserName;
    private String browserVersion;
    private boolean androidEnabled;

    public DockerImageParameters(DriverManagerType driverManagerType, String cacheKey,
                                 String browserName, String browserVersion, boolean androidEnabled) {
        this.driverManagerType = driverManagerType;
        this.cacheKey = cacheKey;
        this.browserName = browserName;
        this.browserVersion = browserVersion;
        this.androidEnabled = androidEnabled;
    }

    public DriverManagerType getDriverManagerType() {
        return driverManagerType;
    }

    public void setDriverManagerType(DriverManagerType driverManagerType) {
        this.driverManagerType = driverManagerType;
    }

    public String getCacheKey() {
        return cacheKey;
    }

    public void setCacheKey(String cacheKey) {
        this.cacheKey = cacheKey;
    }

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    public String getBrowserVersion() {
        return browserVersion;
    }

    public void setBrowserVersion(String browserVersion) {
        this.browserVersion = browserVersion;
    }

    public boolean isAndroidEnabled() {
        return androidEnabled;
    }

    public void setAndroidEnabled(boolean androidEnabled) {
        this.androidEnabled = androidEnabled;
    }
}
