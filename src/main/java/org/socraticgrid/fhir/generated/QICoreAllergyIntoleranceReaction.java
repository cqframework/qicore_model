package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceCertaintyEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import java.util.Date;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.AnnotationDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceSeverityEnum;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreAllergyIntoleranceReaction
{

   private AllergyIntolerance.Reaction adaptedClass = null;

   public QICoreAllergyIntoleranceReaction()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.AllergyIntolerance.Reaction();
   }

   public QICoreAllergyIntoleranceReaction(AllergyIntolerance.Reaction adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public AllergyIntolerance.Reaction getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(AllergyIntolerance.Reaction param)
   {
      this.adaptedClass = param;
   }

   public String getCertainty()
   {
      return adaptedClass.getCertainty();
   }

   public QICoreAllergyIntoleranceReaction setCertainty(String param)
   {
      adaptedClass
            .setCertainty(ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceCertaintyEnum
                  .valueOf(param));
      return this;
   }

   public QICoreAllergyIntoleranceReaction setCertainty(
         AllergyIntoleranceCertaintyEnum param)
   {
      adaptedClass.setCertainty(param);
      return this;
   }

   public BoundCodeDt<AllergyIntoleranceCertaintyEnum> getCertaintyElement()
   {
      return adaptedClass.getCertaintyElement();
   }

   public QICoreAllergyIntoleranceReaction setCertainty(
         BoundCodeDt<AllergyIntoleranceCertaintyEnum> param)
   {
      adaptedClass.setCertainty(param);
      return this;
   }

   public ExtensionDt getDuration()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/allergyintolerance-duration");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.api.ExtensionDt) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for duration");
      }
   }

   public QICoreAllergyIntoleranceReaction setDuration(ExtensionDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/allergyintolerance-duration",
                  param);
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

   public QICoreAllergyIntoleranceReaction setOnset(Date param)
   {
      adaptedClass
            .setOnset(new ca.uhn.fhir.model.primitive.DateTimeDt(param));
      return this;
   }

   public QICoreAllergyIntoleranceReaction setOnset(DateTimeDt param)
   {
      adaptedClass.setOnset(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public QICoreAllergyIntoleranceReaction setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public CodeableConceptDt getExposureRoute()
   {
      return adaptedClass.getExposureRoute();
   }

   public QICoreAllergyIntoleranceReaction setExposureRoute(
         CodeableConceptDt param)
   {
      adaptedClass.setExposureRoute(param);
      return this;
   }

   public AnnotationDt getNote()
   {
      return adaptedClass.getNote();
   }

   public QICoreAllergyIntoleranceReaction setNote(AnnotationDt param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public StringDt getDescriptionElement()
   {
      return adaptedClass.getDescriptionElement();
   }

   public String getDescription()
   {
      return adaptedClass.getDescription();
   }

   public QICoreAllergyIntoleranceReaction setDescription(String param)
   {
      adaptedClass.setDescription(new ca.uhn.fhir.model.primitive.StringDt(
            param));
      return this;
   }

   public QICoreAllergyIntoleranceReaction setDescription(StringDt param)
   {
      adaptedClass.setDescription(param);
      return this;
   }

   public CodeableConceptDt getSubstance()
   {
      return adaptedClass.getSubstance();
   }

   public QICoreAllergyIntoleranceReaction setSubstance(CodeableConceptDt param)
   {
      adaptedClass.setSubstance(param);
      return this;
   }

   public String getSeverity()
   {
      return adaptedClass.getSeverity();
   }

   public QICoreAllergyIntoleranceReaction setSeverity(String param)
   {
      adaptedClass
            .setSeverity(ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceSeverityEnum
                  .valueOf(param));
      return this;
   }

   public QICoreAllergyIntoleranceReaction setSeverity(
         AllergyIntoleranceSeverityEnum param)
   {
      adaptedClass.setSeverity(param);
      return this;
   }

   public BoundCodeDt<AllergyIntoleranceSeverityEnum> getSeverityElement()
   {
      return adaptedClass.getSeverityElement();
   }

   public QICoreAllergyIntoleranceReaction setSeverity(
         BoundCodeDt<AllergyIntoleranceSeverityEnum> param)
   {
      adaptedClass.setSeverity(param);
      return this;
   }
}