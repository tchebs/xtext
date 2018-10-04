package org.xtext.example.mydsl.validation;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.entityDsl.Entity;
import org.xtext.example.mydsl.entityDsl.EntityDslPackage;
import org.xtext.example.mydsl.entityDsl.Model;
import org.xtext.example.mydsl.entityDsl.Property;
import org.xtext.example.mydsl.entityDsl.Type;
import org.xtext.example.mydsl.validation.AbstractEntityDslValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class EntityDslValidator extends AbstractEntityDslValidator {
  public final static String INVALID_NAME = "invalidName";
  
  @Check
  public void checkNameStartsWithCapital(final Entity entity) {
    boolean _isUpperCase = Character.isUpperCase(entity.getName().charAt(0));
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.warning("Name should start with a capital", EntityDslPackage.Literals.TYPE__NAME);
    }
  }
  
  @Check
  public void checkEntityNameIsUniqueWithinModel(final Entity entity) {
    EObject _eContainer = entity.eContainer();
    Model model = ((Model) _eContainer);
    boolean _notEquals = (!Objects.equal(model, null));
    if (_notEquals) {
      EList<Type> _elements = model.getElements();
      for (final Type element : _elements) {
        if ((((element instanceof Entity) && (!element.equals(entity))) && element.getName().equals(entity.getName()))) {
          this.error("Entity names have to be unique in a model", EntityDslPackage.Literals.TYPE__NAME);
          return;
        }
      }
    }
  }
  
  @Check
  public void checkPropertyNameIsUniqueWithinEntity(final Property property) {
    EObject _eContainer = property.eContainer();
    Entity entity = ((Entity) _eContainer);
    boolean _notEquals = (!Objects.equal(entity, null));
    if (_notEquals) {
      EList<Property> _properties = entity.getProperties();
      for (final Property element : _properties) {
        if ((((element instanceof Property) && (!element.equals(property))) && element.getName().equals(property.getName()))) {
          this.error("Property names have to be unique in an entity", EntityDslPackage.Literals.PROPERTY__NAME);
          return;
        }
      }
    }
  }
}
