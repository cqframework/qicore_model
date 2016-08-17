package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IAllergyIntolerance;
import ca.uhn.fhir.model.dstu2.resource.AllergyIntolerance;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceTypeEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceCriticalityEnum;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceCategoryEnum;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceStatusEnum;
import ca.uhn.fhir.model.dstu2.composite.AnnotationDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class AllergyIntoleranceAdapter implements IAllergyIntolerance
{

   private AllergyIntolerance adaptedClass = null;

   public AllergyIntoleranceAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.AllergyIntolerance();
   }

   public AllergyIntoleranceAdapter(AllergyIntolerance adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public AllergyIntolerance getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(AllergyIntolerance param)
   {
      this.adaptedClass = param;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IAllergyIntolerance setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IAllergyIntolerance addIdentifier(IdentifierDt param)
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

   public String getType()
   {
      return adaptedClass.getType();
   }

   public IAllergyIntolerance setType(String param)
   {
      adaptedClass
            .setType(ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceTypeEnum
                  .valueOf(param));
      return this;
   }

   public IAllergyIntolerance setType(AllergyIntoleranceTypeEnum param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public BoundCodeDt<AllergyIntoleranceTypeEnum> getTypeElement()
   {
      return adaptedClass.getTypeElement();
   }

   public IAllergyIntolerance setType(
         BoundCodeDt<AllergyIntoleranceTypeEnum> param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public CodeableConceptDt getSubstance()
   {
      return adaptedClass.getSubstance();
   }

   public IAllergyIntolerance setSubstance(CodeableConceptDt param)
   {
      adaptedClass.setSubstance(param);
      return this;
   }

   public List<AllergyIntolerance.Reaction> getReaction()
   {
      return adaptedClass.getReaction();
   }

   public IAllergyIntolerance setReaction(
         List<AllergyIntolerance.Reaction> param)
   {
      adaptedClass.setReaction(param);
      return this;
   }

   public IAllergyIntolerance addReaction(AllergyIntolerance.Reaction param)
   {
      adaptedClass.addReaction(param);
      return this;
   }

   public AllergyIntolerance.Reaction addReaction()
   {
      ca.uhn.fhir.model.dstu2.resource.AllergyIntolerance.Reaction item = new ca.uhn.fhir.model.dstu2.resource.AllergyIntolerance.Reaction();
      adaptedClass.addReaction(item);
      return item;
   }

   public AllergyIntolerance.Reaction getReactionFirstRep()
   {
      return adaptedClass.getReactionFirstRep();
   }

   public String getCriticality()
   {
      return adaptedClass.getCriticality();
   }

   public IAllergyIntolerance setCriticality(String param)
   {
      adaptedClass
            .setCriticality(ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceCriticalityEnum
                  .valueOf(param));
      return this;
   }

   public IAllergyIntolerance setCriticality(
         AllergyIntoleranceCriticalityEnum param)
   {
      adaptedClass.setCriticality(param);
      return this;
   }

   public BoundCodeDt<AllergyIntoleranceCriticalityEnum> getCriticalityElement()
   {
      return adaptedClass.getCriticalityElement();
   }

   public IAllergyIntolerance setCriticality(
         BoundCodeDt<AllergyIntoleranceCriticalityEnum> param)
   {
      adaptedClass.setCriticality(param);
      return this;
   }

   public String getCategory()
   {
      return adaptedClass.getCategory();
   }

   public IAllergyIntolerance setCategory(String param)
   {
      adaptedClass
            .setCategory(ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceCategoryEnum
                  .valueOf(param));
      return this;
   }

   public IAllergyIntolerance setCategory(AllergyIntoleranceCategoryEnum param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

   public BoundCodeDt<AllergyIntoleranceCategoryEnum> getCategoryElement()
   {
      return adaptedClass.getCategoryElement();
   }

   public IAllergyIntolerance setCategory(
         BoundCodeDt<AllergyIntoleranceCategoryEnum> param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

   public DateTimeDt getLastOccurenceElement()
   {
      return adaptedClass.getLastOccurenceElement();
   }

   public Date getLastOccurence()
   {
      return adaptedClass.getLastOccurence();
   }

   public IAllergyIntolerance setLastOccurence(Date param)
   {
      adaptedClass
            .setLastOccurence(new ca.uhn.fhir.model.primitive.DateTimeDt(
                  param));
      return this;
   }

   public IAllergyIntolerance setLastOccurence(DateTimeDt param)
   {
      adaptedClass.setLastOccurence(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IAllergyIntolerance setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceStatusEnum
                  .valueOf(param));
      return this;
   }

   public IAllergyIntolerance setStatus(AllergyIntoleranceStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<AllergyIntoleranceStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IAllergyIntolerance setStatus(
         BoundCodeDt<AllergyIntoleranceStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public AnnotationDt getNote()
   {
      return adaptedClass.getNote();
   }

   public IAllergyIntolerance setNote(AnnotationDt param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IAllergyIntolerance setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IAllergyIntolerance setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public Patient getPatientResource()
   {
      if (adaptedClass.getPatient().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Patient)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Patient) adaptedClass
               .getPatient().getResource();
      }
      else
      {
         return null;
      }
   }

   public IAllergyIntolerance setPatientResource(Patient param)
   {
      adaptedClass.getPatient().setResource(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IAllergyIntolerance setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IAllergyIntolerance setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public DateTimeDt getRecordedDateElement()
   {
      return adaptedClass.getRecordedDateElement();
   }

   public Date getRecordedDate()
   {
      return adaptedClass.getRecordedDate();
   }

   public IAllergyIntolerance setRecordedDate(Date param)
   {
      adaptedClass
            .setRecordedDate(new ca.uhn.fhir.model.primitive.DateTimeDt(
                  param));
      return this;
   }

   public IAllergyIntolerance setRecordedDate(DateTimeDt param)
   {
      adaptedClass.setRecordedDate(param);
      return this;
   }

   public DateTimeDt getOnsetElement()
   {
      return adaptedClass.getOnsetElement();
   }

   public Date getOnset()
   {
      return adaptedClass.getOnset();
   }

   public IAllergyIntolerance setOnset(Date param)
   {
      adaptedClass
            .setOnset(new ca.uhn.fhir.model.primitive.DateTimeDt(param));
      return this;
   }

   public IAllergyIntolerance setOnset(DateTimeDt param)
   {
      adaptedClass.setOnset(param);
      return this;
   }
}