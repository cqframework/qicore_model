package org.socraticgrid.fhir.dstu3.generated;

import org.hl7.fhir.dstu3.model.Substance;
import org.hl7.fhir.dstu3.model.*;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.StringType;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import java.lang.String;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;

public interface Iqicoresubstance
{

   public Substance getAdaptee();

   public void setAdaptee(Substance param);

   public boolean hasDescription();

   public boolean hasDescriptionElement();

   public StringType getDescriptionElement();

   public String getDescription();

   public Iqicoresubstance setDescriptionElement(StringType param);

   public Iqicoresubstance setDescription(String param);

   public boolean hasImplicitRules();

   public boolean hasImplicitRulesElement();

   public UriType getImplicitRulesElement();

   public String getImplicitRules();

   public Iqicoresubstance setImplicitRulesElement(UriType param);

   public Iqicoresubstance setImplicitRules(String param);

   public List<Substance.SubstanceIngredientComponent> getIngredient();

   public qicoresubstanceAdapter setIngredient(
         List<Substance.SubstanceIngredientComponent> param);

   public boolean hasIngredient();

   public qicoresubstanceAdapter addIngredient(
         Substance.SubstanceIngredientComponent param);

   public Substance.SubstanceIngredientComponent addIngredient();

   public boolean hasId();

   public boolean hasIdElement();

   public IdType getIdElement();

   public String getId();

   public Iqicoresubstance setIdElement(IdType param);

   public Iqicoresubstance setId(String param);

   public List<Substance.SubstanceInstanceComponent> getInstance();

   public qicoresubstanceAdapter setInstance(
         List<Substance.SubstanceInstanceComponent> param);

   public boolean hasInstance();

   public qicoresubstanceAdapter addInstance(
         Substance.SubstanceInstanceComponent param);

   public Substance.SubstanceInstanceComponent addInstance();

   public List<Identifier> getIdentifier();

   public Iqicoresubstance setIdentifier(List<Identifier> param);

   public boolean hasIdentifier();

   public Iqicoresubstance addIdentifier(Identifier param);

   public Identifier addIdentifier();

   public CodeableConcept getCode();

   public Iqicoresubstance setCode(CodeableConcept param);

   public boolean hasCode();

   public boolean hasLanguage();

   public boolean hasLanguageElement();

   public CodeType getLanguageElement();

   public String getLanguage();

   public Iqicoresubstance setLanguageElement(CodeType param);

   public Iqicoresubstance setLanguage(String param);

   public List<Resource> getContained();

   public Iqicoresubstance setContained(List<Resource> param);

   public boolean hasContained();

   public Iqicoresubstance addContained(Resource param);

   public List<CodeableConcept> getCategory();

   public Iqicoresubstance setCategory(List<CodeableConcept> param);

   public boolean hasCategory();

   public Iqicoresubstance addCategory(CodeableConcept param);

   public CodeableConcept addCategory();
}