/* 
 * This file is part of Quelea, free projection software for churches.
 * Copyright (C) 2011 Michael Berry
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.quelea.windows.library;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 * The image panel in the library.
 * @author Michael
 */
public class LibraryImagePanel extends JPanel {

    private final ImageListPanel imagePanel;

    /**
     * Create a new library image panel.
     */
    public LibraryImagePanel() {
        setLayout(new BorderLayout());
        imagePanel = new ImageListPanel("img");
        add(imagePanel, BorderLayout.CENTER);
    }

    /**
     * Get the image list panel.
     * @return the image list panel.
     */
    public ImageListPanel getImagePanel() {
        return imagePanel;
    }
}
