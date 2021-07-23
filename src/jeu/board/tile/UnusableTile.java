package jeu.board.tile;

import jeu.board.tile.resource.Resource;

import jeu.character.Character;
import jeu.exception.TileException;
/**
 * @author 
 *
 */
public abstract class UnusableTile implements Tile {

    /**
     * return the resource of the territory
     * @return return the resource of the tile
     */
    public Resource getResource() {
        return null;
    }

    /**
     * allow to get the size of the squad which occupe the tile
     * @return return the size of the squad that exploit the tile
     */
    public int getMaxCharacterAllowed() {
        return 0;
    };

    /**
     * check is the tile is used or not.
     * A tile is used, if a character is placed here.
     * @return true if the tile is used, false if not
     */
    public boolean isBusy() {
        return false;
    }

    /**
     * To receive a chracter, the squad's size must be above the maximum size allow by the tile.
     * @param character the character to check if it's can occupe the tile or not.
     * @return true if the charcter can occupe, false if not
     */
    public boolean canSupportSize(Character character) {
        return false;
    }

    /**
     * determine the impact of the tile of the character reward.
     * @return the value to multiply with the the squad size to determin the reward's value.
     */
    public int getReawardCoef() {
        return 0;
    }

    /**
     * le bonus de la taille reative correspond à celle qu'on ajoute à la taille(effectif) du personnage.
     * Exemple (sur un montagne, une armée de taille 3 voit sa taille augmentée de 2 soit 5 comme taille relative)
     * @return relative size of the character du to the impact of the tiles where occupied by.
     */
    public int getRelativeSizeBonus() {
        return 0;
    }

    /**
     * return the bonus point
     * @return return the bonus point
     */
    public int getBonusValue() {
        return 0;
    }

    /**
     * allow to set a new character to occupy the tile.
     * @param character the new character to affect to this tile.
     * @throws TileException
     */
    public void setCharacter(Character character) throws TileException {
    	throw new TileException("Tile already used");
    }
    /**
     * allow to get the current character who use the tile.
     * @return the chracter placed on the tile.
     */
    public Character getCharacter() {
        return null;
    }

    /**
     * allow to remove acharacter from the tile.
     */
    public void removeCharacter() {
    }

    /**
     * The name of the tile, it can be the same as the type.
     * @return the tile's name.
     */
    public abstract String name();
}

