package jadt.themes.info;

public class SoftwareInfo {
    private static final String buildDate = "2022.10.1";
    private static final String buildVersion ="v1.0_rc1";
    private static final String buildStage = "Release Candidate";
    private static final String About = "Theme plugin for JADT";

    public static String getBuildDate() {
        return buildDate;
    }

    public static String getBuildVersion() {
        return buildVersion;
    }

    public static String getBuildStage() {
        return buildStage;
    }

    public static String getAbout() {
        return About;
    }
}
