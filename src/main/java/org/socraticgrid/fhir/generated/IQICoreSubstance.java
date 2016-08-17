package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.resource.Substance;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IQICoreSubstance
{

   public Substance getAdaptee();

   public void setAdaptee(Substance param);

   public StringDt getDescriptionElement();

   public String getDescription();

   public IQICoreSubstance setDescription(String param);

   public IQICoreSubstance setDescription(StringDt param);

   public List<Substance.Ingredient> getIngredient();

   public IQICoreSubstance setIngredient(List<Substance.Ingredient> param);

   public IQICoreSubstance addIngredient(Substance.Ingredient param);

   public Substance.Ingredient addIngredient();

   public Substance.Ingredient getIngredientFirstRep();

   public IdDt getId();

   public IQICoreSubstance setId(IdDt param);

   public List<Substance.Instance> getInstance();

   public IQICoreSubstance setInstance(List<Substance.Instance> param);

   public IQICoreSubstance addInstance(Substance.Instance param);

   public Substance.Instance addInstance();

   public Substance.Instance getInstanceFirstRep();

   public List<IdentifierDt> getIdentifier();

   public IQICoreSubstance setIdentifier(List<IdentifierDt> param);

   public IQICoreSubstance addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public NarrativeDt getText();

   public IQICoreSubstance setText(NarrativeDt param);

   public CodeableConceptDt getCode();

   public IQICoreSubstance setCode(CodeableConceptDt param);

   public CodeDt getLanguage();

   public IQICoreSubstance setLanguage(CodeDt param);

   public ContainedDt getContained();

   public IQICoreSubstance setContained(ContainedDt param);
}