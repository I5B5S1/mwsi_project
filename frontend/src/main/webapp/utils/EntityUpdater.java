package main.webapp.utils;

import java.lang.reflect.Field;

public class EntityUpdater {
	public static void updateEntity(Object entityToUpdate, Object entityWithChanges) {
		Class<?> clazz = entityToUpdate.getClass();
		for (Field entityField : clazz.getDeclaredFields()) {
			try {
				entityField.setAccessible(true);
				if (entityField.get(entityWithChanges) != null) {
					entityField.set(entityToUpdate, entityField.get(entityWithChanges));
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
			}
		}
	}
}
