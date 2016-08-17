package org.socraticgrid.fhir.dstu3.generated;

import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.Duration;
import java.util.List;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.StringType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.Annotation;
import org.hl7.fhir.dstu3.model.*;
import ca.uhn.fhir.model.api.ExtensionDt;

public class qicoreallergyintoleranceReactionAdapter
{

   private AllergyIntolerance.AllergyIntoleranceReactionComponent adaptedClass;

   public qicoreallergyintoleranceReactionAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceReactionComponent();
   }

   public qicoreallergyintoleranceReactionAdapter(
         AllergyIntolerance.AllergyIntoleranceReactionComponent adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public AllergyIntolerance.AllergyIntoleranceReactionComponent getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(
         AllergyIntolerance.AllergyIntoleranceReactionComponent param)
   {
      this.adaptedClass = param;
   }

   public boolean hasCertainty()
   {
      return adaptedClass.hasCertainty();
   }

   public boolean hasCertaintyElement()
   {
      return adaptedClass.hasCertaintyElement();
   }

   public AllergyIntolerance.AllergyIntoleranceCertainty getCertainty()
   {
      try
      {
         return adaptedClass.getCertainty();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Certainty", e);
      }
   }

   public Enumeration<AllergyIntolerance.AllergyIntoleranceCertainty> getCertaintyElement()
   {
      try
      {
         return adaptedClass.getCertaintyElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting CertaintyElement", e);
      }
   }

   public qicoreallergyintoleranceReactionAdapter setCertainty(
         AllergyIntolerance.AllergyIntoleranceCertainty param)
   {
      adaptedClass.setCertainty(param);
      return this;
   }

   public qicoreallergyintoleranceReactionAdapter setCertaintyElement(
         Enumeration<AllergyIntolerance.AllergyIntoleranceCertainty> param)
   {
      adaptedClass.setCertaintyElement(param);
      return this;
   }

   public Duration getDuration()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/allergyintolerance-duration");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.Duration) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for duration");
      }
   }

   public qicoreallergyintoleranceReactionAdapter setDuration(Duration param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/allergyintolerance-duration")
            .setValue(param);
      return this;
   }

   public List<CodeableConcept> getManifestation()
   {
      try
      {
         return adaptedClass.getManifestation();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Manifestation", e);
      }
   }

   public qicoreallergyintoleranceReactionAdapter setManifestation(
         List<CodeableConcept> param)
   {
      adaptedClass.setManifestation(param);
      return this;
   }

   public boolean hasManifestation()
   {
      return adaptedClass.hasManifestation();
   }

   public qicoreallergyintoleranceReactionAdapter addManifestation(
         CodeableConcept param)
   {
      adaptedClass.addManifestation(param);
      return this;
   }

   public CodeableConcept addManifestation()
   {
      return adaptedClass.addManifestation();
   }

   public boolean hasId()
   {
      return adaptedClass.hasId();
   }

   public boolean hasIdElement()
   {
      return adaptedClass.hasIdElement();
   }

   public StringType getIdElement()
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

   public qicoreallergyintoleranceReactionAdapter setIdElement(StringType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public qicoreallergyintoleranceReactionAdapter setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public CodeableConcept getExposureRoute()
   {
      try
      {
         return adaptedClass.getExposureRoute();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ExposureRoute", e);
      }
   }

   public qicoreallergyintoleranceReactionAdapter setExposureRoute(
         CodeableConcept param)
   {
      adaptedClass.setExposureRoute(param);
      return this;
   }

   public boolean hasExposureRoute()
   {
      return adaptedClass.hasExposureRoute();
   }

   public List<Annotation> getNote()
   {
      try
      {
         return adaptedClass.getNote();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Note", e);
      }
   }

   public qicoreallergyintoleranceReactionAdapter setNote(
         List<Annotation> param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public boolean hasNote()
   {
      return adaptedClass.hasNote();
   }

   public qicoreallergyintoleranceReactionAdapter addNote(Annotation param)
   {
      adaptedClass.addNote(param);
      return this;
   }

   public Annotation addNote()
   {
      return adaptedClass.addNote();
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

   public qicoreallergyintoleranceReactionAdapter setDescriptionElement(
         StringType param)
   {
      adaptedClass.setDescriptionElement(param);
      return this;
   }

   public qicoreallergyintoleranceReactionAdapter setDescription(String param)
   {
      adaptedClass.setDescription(param);
      return this;
   }

   public CodeableConcept getSubstance()
   {
      try
      {
         return adaptedClass.getSubstance();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Substance", e);
      }
   }

   public qicoreallergyintoleranceReactionAdapter setSubstance(
         CodeableConcept param)
   {
      adaptedClass.setSubstance(param);
      return this;
   }

   public boolean hasSubstance()
   {
      return adaptedClass.hasSubstance();
   }

   public boolean hasSeverity()
   {
      return adaptedClass.hasSeverity();
   }

   public boolean hasSeverityElement()
   {
      return adaptedClass.hasSeverityElement();
   }

   public AllergyIntolerance.AllergyIntoleranceSeverity getSeverity()
   {
      try
      {
         return adaptedClass.getSeverity();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Severity", e);
      }
   }

   public Enumeration<AllergyIntolerance.AllergyIntoleranceSeverity> getSeverityElement()
   {
      try
      {
         return adaptedClass.getSeverityElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting SeverityElement", e);
      }
   }

   public qicoreallergyintoleranceReactionAdapter setSeverity(
         AllergyIntolerance.AllergyIntoleranceSeverity param)
   {
      adaptedClass.setSeverity(param);
      return this;
   }

   public qicoreallergyintoleranceReactionAdapter setSeverityElement(
         Enumeration<AllergyIntolerance.AllergyIntoleranceSeverity> param)
   {
      adaptedClass.setSeverityElement(param);
      return this;
   }
}