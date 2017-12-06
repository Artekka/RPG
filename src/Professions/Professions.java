package Professions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.BiFunction;

/**
 * Keeps track of all static data and helper methods.
 * Responsible for static factory initialization of players, resolved by profession.
 * @author Aya
 *
 */
public class Professions {
	public static final Set<String> ALLOWED_PROFESSION_NAMES;
	private static final List<String> ALLOWED_PROFESSION_NAMES_INDEXABLE;
	private static final Map<String, BiFunction<String, String, BasePlayer>> PROFESSION_NAME_TO_CONSTRUCTOR;

	/**
	 * Static initializer block.
	 * TODO: Consider using Guava immutable collections. 
	 *  It would make this code a lot cleaner and reduce the need for static initializer block.
	 */
	static {
		final Set<String> setBuilder = new HashSet<>();
		setBuilder.add("MAGE");
		setBuilder.add("MARKSMAN");
		setBuilder.add("SWORDSMAN");
		setBuilder.add("TANK");
		ALLOWED_PROFESSION_NAMES = Collections.unmodifiableSet(setBuilder);
		ALLOWED_PROFESSION_NAMES_INDEXABLE = Collections.unmodifiableList(new ArrayList<String>(ALLOWED_PROFESSION_NAMES));
		
		final Map<String, BiFunction<String, String, BasePlayer>> mapBuilder = new HashMap<>();
		mapBuilder.put("MAGE", Mage::new);
		mapBuilder.put("MARKSMAN", Marksman::new);
		mapBuilder.put("SWORDSMAN", Swordsman::new);
		mapBuilder.put("TANK", Tank::new);
		PROFESSION_NAME_TO_CONSTRUCTOR = Collections.unmodifiableMap(mapBuilder);
	}
	
	public static String getRandomProfession(final Random rng) {
		return ALLOWED_PROFESSION_NAMES_INDEXABLE.get(rng.nextInt(ALLOWED_PROFESSION_NAMES_INDEXABLE.size()));
	}
	
	public static BasePlayer getPlayerForProfession(final String profession, final String playerName, final String weaponName) {
		return PROFESSION_NAME_TO_CONSTRUCTOR.get(profession).apply(playerName, weaponName);
	}
	
	public static boolean isValidProfession(final String profession) {
		return ALLOWED_PROFESSION_NAMES.contains(profession);
	}
}
