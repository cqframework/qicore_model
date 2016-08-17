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
import org.socraticgrid.fhir.generated.QICoreAllergyIntoleranceReaction;
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
import ca.uhn.fhir.model.dstu2.resource.*;
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

public interface IQICoreAllergyIntolerance
{

   public AllergyIntolerance getAdaptee();

   public void setAdaptee(AllergyIntolerance param);

   public List<IdentifierDt> getIdentifier();

   public IQICoreAllergyIntolerance setIdentifier(List<IdentifierDt> param);

   public IQICoreAllergyIntolerance addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public String getType();

   public IQICoreAllergyIntolerance setType(String param);

   public IQICoreAllergyIntolerance setType(AllergyIntoleranceTypeEnum param);

   public BoundCodeDt<AllergyIntoleranceTypeEnum> getTypeElement();

   public IQICoreAllergyIntolerance setType(
         BoundCodeDt<AllergyIntoleranceTypeEnum> param);

   public CodeableConceptDt getSubstance();

   public IQICoreAllergyIntolerance setSubstance(CodeableConceptDt param);

   public List<QICoreAllergyIntoleranceReaction> getWrappedReaction();

   public IQICoreAllergyIntolerance setWrappedReaction(
         List<QICoreAllergyIntoleranceReaction> param);

   public IQICoreAllergyIntolerance addWrappedReaction(
         QICoreAllergyIntoleranceReaction param);

   public QICoreAllergyIntoleranceReaction addWrappedReaction();

   public QICoreAllergyIntoleranceReaction getWrappedReactionFirstRep();

   public List<AllergyIntolerance.Reaction> getReaction();

   public IQICoreAllergyIntolerance setReaction(
         List<AllergyIntolerance.Reaction> param);

   public IQICoreAllergyIntolerance addReaction(
         AllergyIntolerance.Reaction param);

   public AllergyIntolerance.Reaction addReaction();

   public AllergyIntolerance.Reaction getReactionFirstRep();

   public String getCriticality();

   public IQICoreAllergyIntolerance setCriticality(String param);

   public IQICoreAllergyIntolerance setCriticality(
         AllergyIntoleranceCriticalityEnum param);

   public BoundCodeDt<AllergyIntoleranceCriticalityEnum> getCriticalityElement();

   public IQICoreAllergyIntolerance setCriticality(
         BoundCodeDt<AllergyIntoleranceCriticalityEnum> param);

   public String getCategory();

   public IQICoreAllergyIntolerance setCategory(String param);

   public IQICoreAllergyIntolerance setCategory(
         AllergyIntoleranceCategoryEnum param);

   public BoundCodeDt<AllergyIntoleranceCategoryEnum> getCategoryElement();

   public IQICoreAllergyIntolerance setCategory(
         BoundCodeDt<AllergyIntoleranceCategoryEnum> param);

   public ExtensionDt getResolutionAge();

   public IQICoreAllergyIntolerance setResolutionAge(ExtensionDt param);

   public CodeableConceptDt getReasonRefuted();

   public IQICoreAllergyIntolerance setReasonRefuted(CodeableConceptDt param);

   public DateTimeDt getLastOccurenceElement();

   public Date getLastOccurence();

   public IQICoreAllergyIntolerance setLastOccurence(Date param);

   public IQICoreAllergyIntolerance setLastOccurence(DateTimeDt param);

   public String getStatus();

   public IQICoreAllergyIntolerance setStatus(String param);

   public IQICoreAllergyIntolerance setStatus(
         AllergyIntoleranceStatusEnum param);

   public BoundCodeDt<AllergyIntoleranceStatusEnum> getStatusElement();

   public IQICoreAllergyIntolerance setStatus(
         BoundCodeDt<AllergyIntoleranceStatusEnum> param);

   public AnnotationDt getNote();

   public IQICoreAllergyIntolerance setNote(AnnotationDt param);

   public ContainedDt getContained();

   public IQICoreAllergyIntolerance setContained(ContainedDt param);

   public CodeDt getLanguage();

   public IQICoreAllergyIntolerance setLanguage(CodeDt param);

   public QICorePatientAdapter getPatientResource();

   public IQICoreAllergyIntolerance setPatientResource(
         QICorePatientAdapter param);

   public NarrativeDt getText();

   public IQICoreAllergyIntolerance setText(NarrativeDt param);

   public IdDt getId();

   public IQICoreAllergyIntolerance setId(IdDt param);

   public DateTimeDt getRecordedDateElement();

   public Date getRecordedDate();

   public IQICoreAllergyIntolerance setRecordedDate(Date param);

   public IQICoreAllergyIntolerance setRecordedDate(DateTimeDt param);

   public DateTimeDt getOnsetElement();

   public Date getOnset();

   public IQICoreAllergyIntolerance setOnset(Date param);

   public IQICoreAllergyIntolerance setOnset(DateTimeDt param);
}