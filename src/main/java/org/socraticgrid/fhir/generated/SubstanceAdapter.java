package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.ISubstance;
import ca.uhn.fhir.model.dstu2.resource.Substance;
import ca.uhn.fhir.model.primitive.StringDt;
import java.util.List;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class SubstanceAdapter implements ISubstance
{

   private Substance adaptedClass = null;

   public SubstanceAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Substance();
   }

   public SubstanceAdapter(Substance adaptee)
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

   public StringDt getDescriptionElement()
   {
      return adaptedClass.getDescriptionElement();
   }

   public String getDescription()
   {
      return adaptedClass.getDescription();
   }

   public ISubstance setDescription(String param)
   {
      adaptedClass.setDescription(new ca.uhn.fhir.model.primitive.StringDt(
            param));
      return this;
   }

   public ISubstance setDescription(StringDt param)
   {
      adaptedClass.setDescription(param);
      return this;
   }

   public List<Substance.Ingredient> getIngredient()
   {
      return adaptedClass.getIngredient();
   }

   public ISubstance setIngredient(List<Substance.Ingredient> param)
   {
      adaptedClass.setIngredient(param);
      return this;
   }

   public ISubstance addIngredient(Substance.Ingredient param)
   {
      adaptedClass.addIngredient(param);
      return this;
   }

   public Substance.Ingredient addIngredient()
   {
      ca.uhn.fhir.model.dstu2.resource.Substance.Ingredient item = new ca.uhn.fhir.model.dstu2.resource.Substance.Ingredient();
      adaptedClass.addIngredient(item);
      return item;
   }

   public Substance.Ingredient getIngredientFirstRep()
   {
      return adaptedClass.getIngredientFirstRep();
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public ISubstance setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public List<Substance.Instance> getInstance()
   {
      return adaptedClass.getInstance();
   }

   public ISubstance setInstance(List<Substance.Instance> param)
   {
      adaptedClass.setInstance(param);
      return this;
   }

   public ISubstance addInstance(Substance.Instance param)
   {
      adaptedClass.addInstance(param);
      return this;
   }

   public Substance.Instance addInstance()
   {
      ca.uhn.fhir.model.dstu2.resource.Substance.Instance item = new ca.uhn.fhir.model.dstu2.resource.Substance.Instance();
      adaptedClass.addInstance(item);
      return item;
   }

   public Substance.Instance getInstanceFirstRep()
   {
      return adaptedClass.getInstanceFirstRep();
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public ISubstance setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public ISubstance addIdentifier(IdentifierDt param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public IdentifierDt addIdentifier()
   {
      ca.uhn.fhir.model.dstu2.composite.IdentifierDt item = new ca.uhn.fhir.model.dstu2.composite.IdentifierDt();
      adaptedClass.addIdentifier(item);
      return item;
   }

   public IdentifierDt getIdentifierFirstRep()
   {
      return adaptedClass.getIdentifierFirstRep();
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public ISubstance setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public CodeableConceptDt getCode()
   {
      return adaptedClass.getCode();
   }

   public ISubstance setCode(CodeableConceptDt param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public ISubstance setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public ISubstance setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }
}