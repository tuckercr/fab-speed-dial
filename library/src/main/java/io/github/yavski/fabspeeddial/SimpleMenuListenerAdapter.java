package io.github.yavski.fabspeeddial;

import android.view.MenuItem;

import com.google.android.material.internal.NavigationMenu;

/**
 * This adapter class provides empty implementations of the methods from
 * {@link FabSpeedDial.MenuListener}.
 * Created by yavorivanov on 03/01/2016.
 */
public class SimpleMenuListenerAdapter implements FabSpeedDial.MenuListener {

    @Override
    public boolean onPrepareMenu(NavigationMenu navigationMenu) {
        return true;
    }

    @Override
    public boolean onMenuItemSelected(MenuItem menuItem) {
        return false;
    }

    @Override
    public void onMenuClosed() {
    }
}
