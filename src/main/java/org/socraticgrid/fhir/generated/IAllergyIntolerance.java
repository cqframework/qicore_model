package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.resource.AllergyIntolerance;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceTypeEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceCriticalityEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceCategoryEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.AnnotationDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
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
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IAllergyIntolerance
{

   public AllergyIntolerance getAdaptee();

   public void setAdaptee(AllergyIntolerance param);

   public List<IdentifierDt> getIdentifier();

   public IAllergyIntolerance setIdentifier(List<IdentifierDt> param);

   public IAllergyIntolerance addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public String getType();

   public IAllergyIntolerance setType(String param);

   public IAllergyIntolerance setType(AllergyIntoleranceTypeEnum param);

   public BoundCodeDt<AllergyIntoleranceTypeEnum> getTypeElement();

   public IAllergyIntolerance setType(
         BoundCodeDt<AllergyIntoleranceTypeEnum> param);

   public CodeableConceptDt getSubstance();

   public IAllergyIntolerance setSubstance(CodeableConceptDt param);

   public List<AllergyIntolerance.Reaction> getReaction();

   public IAllergyIntolerance setReaction(
         List<AllergyIntolerance.Reaction> param);

   public IAllergyIntolerance addReaction(AllergyIntolerance.Reaction param);

   public AllergyIntolerance.Reaction addReaction();

   public AllergyIntolerance.Reaction getReactionFirstRep();

   public String getCriticality();

   public IAllergyIntolerance setCriticality(String param);

   public IAllergyIntolerance setCriticality(
         AllergyIntoleranceCriticalityEnum param);

   public BoundCodeDt<AllergyIntoleranceCriticalityEnum> getCriticalityElement();

   public IAllergyIntolerance setCriticality(
         BoundCodeDt<AllergyIntoleranceCriticalityEnum> param);

   public String getCategory();

   public IAllergyIntolerance setCategory(String param);

   public IAllergyIntolerance setCategory(AllergyIntoleranceCategoryEnum param);

   public BoundCodeDt<AllergyIntoleranceCategoryEnum> getCategoryElement();

   public IAllergyIntolerance setCategory(
         BoundCodeDt<AllergyIntoleranceCategoryEnum> param);

   public DateTimeDt getLastOccurenceElement();

   public Date getLastOccurence();

   public IAllergyIntolerance setLastOccurence(Date param);

   public IAllergyIntolerance setLastOccurence(DateTimeDt param);

   public String getStatus();

   public IAllergyIntolerance setStatus(String param);

   public IAllergyIntolerance setStatus(AllergyIntoleranceStatusEnum param);

   public BoundCodeDt<AllergyIntoleranceStatusEnum> getStatusElement();

   public IAllergyIntolerance setStatus(
         BoundCodeDt<AllergyIntoleranceStatusEnum> param);

   public AnnotationDt getNote();

   public IAllergyIntolerance setNote(AnnotationDt param);

   public ContainedDt getContained();

   public IAllergyIntolerance setContained(ContainedDt param);

   public CodeDt getLanguage();

   public IAllergyIntolerance setLanguage(CodeDt param);

   public Patient getPatientResource();

   public IAllergyIntolerance setPatientResource(Patient param);

   public NarrativeDt getText();

   public IAllergyIntolerance setText(NarrativeDt param);

   public IdDt getId();

   public IAllergyIntolerance setId(IdDt param);

   public DateTimeDt getRecordedDateElement();

   public Date getRecordedDate();

   public IAllergyIntolerance setRecordedDate(Date param);

   public IAllergyIntolerance setRecordedDate(DateTimeDt param);

   public DateTimeDt getOnsetElement();

   public Date getOnset();

   public IAllergyIntolerance setOnset(Date param);

   public IAllergyIntolerance setOnset(DateTimeDt param);
}