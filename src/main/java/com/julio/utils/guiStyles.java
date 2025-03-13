/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julio.utils;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author ACER
 */
public class guiStyles {
     public static void centrarInternalVentana(JDesktopPane dp, JInternalFrame frame) {
        dp.add(frame);
        Dimension desktopSize = dp.getSize();
        Dimension internalFrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - internalFrameSize.width) / 2, (desktopSize.height - internalFrameSize.height) / 2);
        aparecerInternalVentana(frame);
    }

    private static void aparecerInternalVentana(JInternalFrame frame) {
        frame.setVisible(true);
    }
}
