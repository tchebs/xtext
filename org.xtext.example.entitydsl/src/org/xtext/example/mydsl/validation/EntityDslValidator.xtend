///*
// * generated by Xtext 2.12.0
// */
//package org.xtext.example.mydsl.validation
//
//
///**
// * This class contains custom validation rules. 
// *
// * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
// */
//class EntityDslValidator extends AbstractEntityDslValidator {
//	
////	public static val INVALID_NAME = 'invalidName'
////
////	@Check
////	def checkGreetingStartsWithCapital(Greeting greeting) {
////		if (!Character.isUpperCase(greeting.name.charAt(0))) {
////			warning('Name should start with a capital', 
////					EntityDslPackage.Literals.GREETING__NAME,
////					INVALID_NAME)
////		}
////	}
//
//	
//}

/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.validation

import org.eclipse.xtext.validation.Check
import org.xtext.example.mydsl.entityDsl.EntityDslPackage
import org.xtext.example.mydsl.entityDsl.Entity
import org.xtext.example.mydsl.entityDsl.Model

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class EntityDslValidator extends AbstractEntityDslValidator {

	public static val INVALID_NAME = 'invalidName'

	@Check
	def void checkNameStartsWithCapital(Entity entity) {
		if (!Character.isUpperCase(entity.getName().charAt(0))) {
			warning("Name should start with a capital", EntityDslPackage.Literals.TYPE__NAME);
		}
	}
	
	@Check
	def void checkEntityNameIsUniqueWithinModel(Entity entity) {
		var model = (entity.eContainer() as Model);
		if (model != null) {
			for (element : model.getElements()) {
				if (element instanceof Entity && !element.equals(entity) && element.getName().equals(entity.getName())) {
					error("Entity names have to be unique in a model", EntityDslPackage.Literals.TYPE__NAME);
					return;
				}
			}
		}
	}

	@Check
	def void checkPropertyNameIsUniqueWithinEntity(org.xtext.example.mydsl.entityDsl.Property property) {
		var entity = (property.eContainer() as Entity);
		if (entity != null) {
			for (element : entity.getProperties()) {
				if (element instanceof org.xtext.example.mydsl.entityDsl.Property && !element.equals(property) && element.getName().equals(property.getName())) {
					error("Property names have to be unique in an entity", EntityDslPackage.Literals.PROPERTY__NAME);
					return;
				}
			}
		}
	}

}
