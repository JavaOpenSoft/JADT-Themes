package jadt.themes.main;

import com.alee.laf.WebLookAndFeel;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import com.jtattoo.plaf.fast.FastLookAndFeel;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import com.jtattoo.plaf.luna.LunaLookAndFeel;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import com.jtattoo.plaf.mint.MintLookAndFeel;
import com.jtattoo.plaf.noire.NoireLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import com.jtattoo.plaf.texture.TextureLookAndFeel;
import jadt.themes.AeroTheme;
import jadt.themes.GraphiteTheme;
import mdlaf.MaterialLookAndFeel;
import mdlaf.themes.MaterialLiteTheme;
import mdlaf.themes.MaterialOceanicTheme;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.io.IOException;

public class Theme {

    private Theme(){

    }
    public static @NotNull String getDefaultTheme(){
        return UIManager.getSystemLookAndFeelClassName();
    }
    @Contract(value = " -> new", pure = true)
    public static @NotNull GraphiteTheme getGraphiteTheme(){
        return new GraphiteTheme();
    }
    @Contract(value = " -> new", pure = true)
    public static @NotNull AeroTheme getAeroTheme(){
        return new AeroTheme();
    }
    @Contract(value = " -> new", pure = true)
    public static @NotNull AcrylLookAndFeel getAcrylTheme(){
        return new AcrylLookAndFeel();
    }
    @Contract(value = " -> new", pure = true)
    public static @NotNull AluminiumLookAndFeel getAluminiumTheme(){
        return new AluminiumLookAndFeel();
    }
    @Contract(value = " -> new", pure = true)
    public static @NotNull BernsteinLookAndFeel getGoldenTheme(){
        return new BernsteinLookAndFeel();
    }
    @Contract(value = " -> new", pure = true)
    public static @NotNull FastLookAndFeel getWindows10Theme(){
        return new FastLookAndFeel();
    }
    @Contract(value = " -> new", pure = true)
    public static @NotNull HiFiLookAndFeel getWindowsXP_BlackTheme() {
        return new HiFiLookAndFeel();
    }
    @Contract(value = " -> new", pure = true)
    public static @NotNull McWinLookAndFeel getMacOSX_AeroTheme() {
        return new McWinLookAndFeel();
    }
    @Contract(value = " -> new", pure = true)
    public static @NotNull MintLookAndFeel getMintTheme() {
        return new MintLookAndFeel();
    }
    @Contract(value = " -> new", pure = true)
    public static @NotNull NoireLookAndFeel getClassicBlackTheme() {
        return new NoireLookAndFeel();
    }
    @Contract(value = " -> new", pure = true)
    public static @NotNull SmartLookAndFeel getClassicAeroTheme() {
        return new SmartLookAndFeel();
    }
    @Contract(value = " -> new", pure = true)
    public static @NotNull LunaLookAndFeel getWindowsXPTheme() {
        return new LunaLookAndFeel();
    }
    @Contract(value = " -> new", pure = true)
    public static @NotNull TextureLookAndFeel getClassicUbuntuTheme() {
        return new TextureLookAndFeel();
    }
    @Contract(value = " -> new", pure = true)
    public static @NotNull MaterialOceanicTheme getMaterialOceanicTheme(){
        return new MaterialOceanicTheme();
    }
    @Contract(value = " -> new", pure = true)
    public static @NotNull MaterialLiteTheme getMaterialThemeClass(){
        return new MaterialLiteTheme();
    }
    @Contract(" -> new")
    public static @NotNull MaterialLookAndFeel getMaterialTheme(){
        return new MaterialLookAndFeel();
    }
    public static FlatDarkLaf getFlatDarkTheme(){
        return new com.formdev.flatlaf.FlatDarkLaf();
    }
    public static FlatLightLaf getFlatLightTheme(){
        return new com.formdev.flatlaf.FlatLightLaf();
    }
    public static FlatIntelliJLaf getSmartFlatLightTheme(){
        return new com.formdev.flatlaf.FlatIntelliJLaf();
    }
    public static FlatDarculaLaf getSmartFlatDarkTheme(){
        return new com.formdev.flatlaf.FlatDarculaLaf();
    }
    public static WebLookAndFeel getClassicWebsiteThemeClass(){
        return new WebLookAndFeel();
    }


}
