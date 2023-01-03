package logic;

import lombok.Setter;


@Setter
public abstract class ItemDecorator extends Item {
    public abstract String getDescription();
}
