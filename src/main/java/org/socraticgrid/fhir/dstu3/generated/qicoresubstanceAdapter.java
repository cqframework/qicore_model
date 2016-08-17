package org.socraticgrid.fhir.dstu3.generated;

import org.socraticgrid.fhir.dstu3.generated.Iqicoresubstance;
import org.hl7.fhir.dstu3.model.Substance;
import org.hl7.fhir.dstu3.model.StringType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.UriType;
import java.util.List;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.*;
import ca.uhn.fhir.model.api.ExtensionDt;

public class qicoresubstanceAdapter implements Iqicoresubstance
{

   private Substance adaptedClass;

   public qicoresubstanceAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.Substance();
   }

   public qicoresubstanceAdapter(Substance adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Substance getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Substance param)
   {
      this.adaptedClass = param;
   }

   public boolean hasDescription()
   {
      return adaptedClass.hasDescription();
   }

   public boolean hasDescriptionElement()
   {
      return adaptedClass.hasDescriptionElement();
   }

   public StringType getDescriptionElement()
   {
      try
      {
         return adaptedClass.getDescriptionElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting DescriptionElement", e);
      }
   }

   public String getDescription()
   {
      try
      {
         return adaptedClass.getDescription();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Description", e);
      }
   }

   public Iqicoresubstance setDescriptionElement(StringType param)
   {
      adaptedClass.setDescriptionElement(param);
      return this;
   }

   public Iqicoresubstance setDescription(String param)
   {
      adaptedClass.setDescription(param);
      return this;
   }

   public boolean hasImplicitRules()
   {
      return adaptedClass.hasImplicitRules();
   }

   public boolean hasImplicitRulesElement()
   {
      return adaptedClass.hasImplicitRulesElement();
   }

   public UriType getImplicitRulesElement()
   {
      try
      {
         return adaptedClass.getImplicitRulesElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ImplicitRulesElement", e);
      }
   }

   public String getImplicitRules()
   {
      try
      {
         return adaptedClass.getImplicitRules();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ImplicitRules", e);
      }
   }

   public Iqicoresubstance setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicoresubstance setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
      return this;
   }

   public List<Substance.SubstanceIngredientComponent> getIngredient()
   {
      try
      {
         return adaptedClass.getIngredient();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Ingredient", e);
      }
   }

   public qicoresubstanceAdapter setIngredient(
         List<Substance.SubstanceIngredientComponent> param)
   {
      adaptedClass.setIngredient(param);
      return this;
   }

   public boolean hasIngredient()
   {
      return adaptedClass.hasIngredient();
   }

   public qicoresubstanceAdapter addIngredient(
         Substance.SubstanceIngredientComponent param)
   {
      adaptedClass.addIngredient(param);
      return this;
   }

   public Substance.SubstanceIngredientComponent addIngredient()
   {
      return adaptedClass.addIngredient();
   }

   public boolean hasId()
   {
      return adaptedClass.hasId();
   }

   public boolean hasIdElement()
   {
      return adaptedClass.hasIdElement();
   }

   public IdType getIdElement()
   {
      try
      {
         return adaptedClass.getIdElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting IdElement", e);
      }
   }

   public String getId()
   {
      try
      {
         return adaptedClass.getId();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Id", e);
      }
   }

   public Iqicoresubstance setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicoresubstance setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public List<Substance.SubstanceInstanceComponent> getInstance()
   {
      try
      {
         return adaptedClass.getInstance();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Instance", e);
      }
   }

   public qicoresubstanceAdapter setInstance(
         List<Substance.SubstanceInstanceComponent> param)
   {
      adaptedClass.setInstance(param);
      return this;
   }

   public boolean hasInstance()
   {
      return adaptedClass.hasInstance();
   }

   public qicoresubstanceAdapter addInstance(
         Substance.SubstanceInstanceComponent param)
   {
      adaptedClass.addInstance(param);
      return this;
   }

   public Substance.SubstanceInstanceComponent addInstance()
   {
      return adaptedClass.addInstance();
   }

   public List<Identifier> getIdentifier()
   {
      try
      {
         return adaptedClass.getIdentifier();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Identifier", e);
      }
   }

   public Iqicoresubstance setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicoresubstance addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
   }

   public CodeableConcept getCode()
   {
      try
      {
         return adaptedClass.getCode();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Code", e);
      }
   }

   public Iqicoresubstance setCode(CodeableConcept param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public boolean hasCode()
   {
      return adaptedClass.hasCode();
   }

   public boolean hasLanguage()
   {
      return adaptedClass.hasLanguage();
   }

   public boolean hasLanguageElement()
   {
      return adaptedClass.hasLanguageElement();
   }

   public CodeType getLanguageElement()
   {
      try
      {
         return adaptedClass.getLanguageElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting LanguageElement", e);
      }
   }

   public String getLanguage()
   {
      try
      {
         return adaptedClass.getLanguage();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Language", e);
      }
   }

   public Iqicoresubstance setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicoresubstance setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public List<Resource> getContained()
   {
      try
      {
         return adaptedClass.getContained();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Contained", e);
      }
   }

   public Iqicoresubstance setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicoresubstance addContained(Resource param)
   {
      adaptedClass.addContained(param);
      return this;
   }

   public List<CodeableConcept> getCategory()
   {
      try
      {
         return adaptedClass.getCategory();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Category", e);
      }
   }

   public Iqicoresubstance setCategory(List<CodeableConcept> param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

   public boolean hasCategory()
   {
      return adaptedClass.hasCategory();
   }

   public Iqicoresubstance addCategory(CodeableConcept param)
   {
      adaptedClass.addCategory(param);
      return this;
   }

   public CodeableConcept addCategory()
   {
      return adaptedClass.addCategory();
   }
}