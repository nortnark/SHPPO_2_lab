package org.example.SpringMenu.menu;

import org.example.SpringMenu.menu.menuitems.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private final List<MenuItem> items;

    private Menu(Menu.Builder builder) {
        items = new ArrayList<>(builder.menu);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < items.size(); i++) {
            builder.append(i).append(". ").append(items.get(i).getText()).append('\n');
        }
        return builder.toString();
    }

    public static class Builder implements Cloneable {
        private List<MenuItem> menu;

        Builder() {
            menu = new ArrayList<>();
        }

        public Builder addItem(MenuItem item) {
            menu.add(item);
            return this;
        }

        public Menu build() {
            return new Menu(this);
        }

        @Override
        public Builder clone() {
            try {
                final Builder clone = (Builder) super.clone();
                clone.menu = new ArrayList<>(clone.menu);
                return clone;
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}
