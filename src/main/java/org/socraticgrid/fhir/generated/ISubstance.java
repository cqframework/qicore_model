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

public interface ISubstance
{

   public Substance getAdaptee();

   public void setAdaptee(Substance param);

   public StringDt getDescriptionElement();

   public String getDescription();

   public ISubstance setDescription(String param);

   public ISubstance setDescription(StringDt param);

   public List<Substance.Ingredient> getIngredient();

   public ISubstance setIngredient(List<Substance.Ingredient> param);

   public ISubstance addIngredient(Substance.Ingredient param);

   public Substance.Ingredient addIngredient();

   public Substance.Ingredient getIngredientFirstRep();

   public IdDt getId();

   public ISubstance setId(IdDt param);

   public List<Substance.Instance> getInstance();

   public ISubstance setInstance(List<Substance.Instance> param);

   public ISubstance addInstance(Substance.Instance param);

   public Substance.Instance addInstance();

   public Substance.Instance getInstanceFirstRep();

   public List<IdentifierDt> getIdentifier();

   public ISubstance setIdentifier(List<IdentifierDt> param);

   public ISubstance addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public NarrativeDt getText();

   public ISubstance setText(NarrativeDt param);

   public CodeableConceptDt getCode();

   public ISubstance setCode(CodeableConceptDt param);

   public CodeDt getLanguage();

   public ISubstance setLanguage(CodeDt param);

   public ContainedDt getContained();

   public ISubstance setContained(ContainedDt param);
}