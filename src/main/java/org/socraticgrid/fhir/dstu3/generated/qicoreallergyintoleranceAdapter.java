package org.socraticgrid.fhir.dstu3.generated;

import org.socraticgrid.fhir.dstu3.generated.Iqicoreallergyintolerance;
import org.hl7.fhir.dstu3.model.AllergyIntolerance;
import org.hl7.fhir.dstu3.model.Identifier;
import java.util.List;
import org.hl7.fhir.dstu3.model.UriType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.RelatedPerson;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.socraticgrid.fhir.dstu3.generated.qicoreallergyintoleranceReactionAdapter;
import org.hl7.fhir.dstu3.model.Age;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Annotation;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.*;
import ca.uhn.fhir.model.api.ExtensionDt;

public class qicoreallergyintoleranceAdapter implements Iqicoreallergyintolerance
{

   private AllergyIntolerance adaptedClass;

   public qicoreallergyintoleranceAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.AllergyIntolerance();
   }

   public qicoreallergyintoleranceAdapter(AllergyIntolerance adaptee)
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

   public Iqicoreallergyintolerance setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicoreallergyintolerance addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
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

   public Iqicoreallergyintolerance setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicoreallergyintolerance setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
      return this;
   }

   public boolean hasType()
   {
      return adaptedClass.hasType();
   }

   public boolean hasTypeElement()
   {
      return adaptedClass.hasTypeElement();
   }

   public AllergyIntolerance.AllergyIntoleranceType getType()
   {
      try
      {
         return adaptedClass.getType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Type", e);
      }
   }

   public Enumeration<AllergyIntolerance.AllergyIntoleranceType> getTypeElement()
   {
      try
      {
         return adaptedClass.getTypeElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting TypeElement", e);
      }
   }

   public Iqicoreallergyintolerance setType(
         AllergyIntolerance.AllergyIntoleranceType param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public Iqicoreallergyintolerance setTypeElement(
         Enumeration<AllergyIntolerance.AllergyIntoleranceType> param)
   {
      adaptedClass.setTypeElement(param);
      return this;
   }

   public Reference getReporter()
   {
      try
      {
         return adaptedClass.getReporter();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Reporter", e);
      }
   }

   public Resource getReporterTarget()
   {
      try
      {
         return adaptedClass.getReporterTarget();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ReporterTarget", e);
      }
   }

   public boolean hasReporter()
   {
      return adaptedClass.hasReporter();
   }

   public Reference getReporterPatient()
   {
      try
      {
         return adaptedClass.getReporter();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Reporter", e);
      }
   }

   public Iqicoreallergyintolerance setReporter(Reference param)
   {
      adaptedClass.setReporter(param);
      return this;
   }

   public Patient getReporterPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getReporterTarget();
   }

   public Iqicoreallergyintolerance setReporterTarget(Patient param)
   {
      adaptedClass.setReporterTarget(param);
      return this;
   }

   public Reference getReporterRelatedPerson()
   {
      try
      {
         return adaptedClass.getReporter();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Reporter", e);
      }
   }

   public RelatedPerson getReporterRelatedPersonTarget()
   {
      return (org.hl7.fhir.dstu3.model.RelatedPerson) adaptedClass
            .getReporterTarget();
   }

   public Iqicoreallergyintolerance setReporterTarget(RelatedPerson param)
   {
      adaptedClass.setReporterTarget(param);
      return this;
   }

   public Reference getReporterPractitioner()
   {
      try
      {
         return adaptedClass.getReporter();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Reporter", e);
      }
   }

   public Practitioner getReporterPractitionerTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
            .getReporterTarget();
   }

   public Iqicoreallergyintolerance setReporterTarget(Practitioner param)
   {
      adaptedClass.setReporterTarget(param);
      return this;
   }

   public List<qicoreallergyintoleranceReactionAdapter> getWrappedReaction() {
		List<org.socraticgrid.fhir.dstu3.generated.qicoreallergyintoleranceReactionAdapter> wrappedItems = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceReactionComponent> items = adaptedClass
				.getReaction();
		for (org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceReactionComponent item : items) {
			wrappedItems
					.add(new org.socraticgrid.fhir.dstu3.generated.qicoreallergyintoleranceReactionAdapter(
							item));
		}
		return wrappedItems;
	}

   public Iqicoreallergyintolerance setWrappedReaction(
			List<qicoreallergyintoleranceReactionAdapter> param) {
		List<org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceReactionComponent> items = new java.util.ArrayList<>();
		for (org.socraticgrid.fhir.dstu3.generated.qicoreallergyintoleranceReactionAdapter item : param) {
			items.add(item.getAdaptee());
		}
		adaptedClass.getReaction().addAll(items);
		return this;
	}

   public Iqicoreallergyintolerance addWrappedReaction(
         qicoreallergyintoleranceReactionAdapter param)
   {
      if (param != null)
      {
         adaptedClass.addReaction(param.getAdaptee());
      }
      return this;
   }

   public qicoreallergyintoleranceReactionAdapter addWrappedReaction()
   {
      org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceReactionComponent item = new org.hl7.fhir.dstu3.model.AllergyIntolerance.AllergyIntoleranceReactionComponent();
      adaptedClass.addReaction(item);
      return new org.socraticgrid.fhir.dstu3.generated.qicoreallergyintoleranceReactionAdapter(
            item);
   }

   public List<AllergyIntolerance.AllergyIntoleranceReactionComponent> getReaction()
   {
      try
      {
         return adaptedClass.getReaction();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Reaction", e);
      }
   }

   public Iqicoreallergyintolerance setReaction(
         List<AllergyIntolerance.AllergyIntoleranceReactionComponent> param)
   {
      adaptedClass.setReaction(param);
      return this;
   }

   public boolean hasReaction()
   {
      return adaptedClass.hasReaction();
   }

   public Iqicoreallergyintolerance addReaction(
         AllergyIntolerance.AllergyIntoleranceReactionComponent param)
   {
      adaptedClass.addReaction(param);
      return this;
   }

   public AllergyIntolerance.AllergyIntoleranceReactionComponent addReaction()
   {
      return adaptedClass.addReaction();
   }

   public boolean hasCriticality()
   {
      return adaptedClass.hasCriticality();
   }

   public boolean hasCriticalityElement()
   {
      return adaptedClass.hasCriticalityElement();
   }

   public AllergyIntolerance.AllergyIntoleranceCriticality getCriticality()
   {
      try
      {
         return adaptedClass.getCriticality();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Criticality", e);
      }
   }

   public Enumeration<AllergyIntolerance.AllergyIntoleranceCriticality> getCriticalityElement()
   {
      try
      {
         return adaptedClass.getCriticalityElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting CriticalityElement", e);
      }
   }

   public Iqicoreallergyintolerance setCriticality(
         AllergyIntolerance.AllergyIntoleranceCriticality param)
   {
      adaptedClass.setCriticality(param);
      return this;
   }

   public Iqicoreallergyintolerance setCriticalityElement(
         Enumeration<AllergyIntolerance.AllergyIntoleranceCriticality> param)
   {
      adaptedClass.setCriticalityElement(param);
      return this;
   }

   public boolean hasCategory()
   {
      return adaptedClass.hasCategory();
   }

   public boolean hasCategoryElement()
   {
      return adaptedClass.hasCategoryElement();
   }

   public AllergyIntolerance.AllergyIntoleranceCategory getCategory()
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

   public Enumeration<AllergyIntolerance.AllergyIntoleranceCategory> getCategoryElement()
   {
      try
      {
         return adaptedClass.getCategoryElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting CategoryElement", e);
      }
   }

   public Iqicoreallergyintolerance setCategory(
         AllergyIntolerance.AllergyIntoleranceCategory param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

   public Iqicoreallergyintolerance setCategoryElement(
         Enumeration<AllergyIntolerance.AllergyIntoleranceCategory> param)
   {
      adaptedClass.setCategoryElement(param);
      return this;
   }

   public Age getResolutionAge()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/allergyintolerance-resolutionAge");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.Age) extensions.get(0).getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for resolutionAge");
      }
   }

   public Iqicoreallergyintolerance setResolutionAge(Age param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/allergyintolerance-resolutionAge")
            .setValue(param);
      return this;
   }

   public CodeableConcept getReasonRefuted()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/allergyintolerance-reasonRefuted");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.CodeableConcept) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for reasonRefuted");
      }
   }

   public Iqicoreallergyintolerance setReasonRefuted(CodeableConcept param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/allergyintolerance-reasonRefuted")
            .setValue(param);
      return this;
   }

   public boolean hasStatus()
   {
      return adaptedClass.hasStatus();
   }

   public boolean hasStatusElement()
   {
      return adaptedClass.hasStatusElement();
   }

   public AllergyIntolerance.AllergyIntoleranceStatus getStatus()
   {
      try
      {
         return adaptedClass.getStatus();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Status", e);
      }
   }

   public Enumeration<AllergyIntolerance.AllergyIntoleranceStatus> getStatusElement()
   {
      try
      {
         return adaptedClass.getStatusElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting StatusElement", e);
      }
   }

   public Iqicoreallergyintolerance setStatus(
         AllergyIntolerance.AllergyIntoleranceStatus param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public Iqicoreallergyintolerance setStatusElement(
         Enumeration<AllergyIntolerance.AllergyIntoleranceStatus> param)
   {
      adaptedClass.setStatusElement(param);
      return this;
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

   public Iqicoreallergyintolerance setNote(List<Annotation> param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public boolean hasNote()
   {
      return adaptedClass.hasNote();
   }

   public Iqicoreallergyintolerance addNote(Annotation param)
   {
      adaptedClass.addNote(param);
      return this;
   }

   public Annotation addNote()
   {
      return adaptedClass.addNote();
   }

   public Reference getRecorder()
   {
      try
      {
         return adaptedClass.getRecorder();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Recorder", e);
      }
   }

   public Resource getRecorderTarget()
   {
      try
      {
         return adaptedClass.getRecorderTarget();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting RecorderTarget", e);
      }
   }

   public boolean hasRecorder()
   {
      return adaptedClass.hasRecorder();
   }

   public Reference getRecorderPractitioner()
   {
      try
      {
         return adaptedClass.getRecorder();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Recorder", e);
      }
   }

   public Iqicoreallergyintolerance setRecorder(Reference param)
   {
      adaptedClass.setRecorder(param);
      return this;
   }

   public Practitioner getRecorderPractitionerTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
            .getRecorderTarget();
   }

   public Iqicoreallergyintolerance setRecorderTarget(Practitioner param)
   {
      adaptedClass.setRecorderTarget(param);
      return this;
   }

   public qicorepractitionerAdapter getRecorderPractitionerAdapterTarget()
   {
      if (adaptedClass.getRecorder().getResource() instanceof org.hl7.fhir.dstu3.model.Practitioner)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorepractitionerAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorepractitionerAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
                     .getRecorder().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreallergyintolerance setRecorderAdapterTarget(
         qicorepractitionerAdapter param)
   {
      adaptedClass.setRecorderTarget(param.getAdaptee());
      return this;
   }

   public Reference getRecorderPatient()
   {
      try
      {
         return adaptedClass.getRecorder();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Recorder", e);
      }
   }

   public Patient getRecorderPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getRecorderTarget();
   }

   public Iqicoreallergyintolerance setRecorderTarget(Patient param)
   {
      adaptedClass.setRecorderTarget(param);
      return this;
   }

   public qicorepatientAdapter getRecorderPatientAdapterTarget()
   {
      if (adaptedClass.getRecorder().getResource() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Patient) adaptedClass
                     .getRecorder().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreallergyintolerance setRecorderAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.setRecorderTarget(param.getAdaptee());
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

   public Iqicoreallergyintolerance setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicoreallergyintolerance addContained(Resource param)
   {
      adaptedClass.addContained(param);
      return this;
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

   public Iqicoreallergyintolerance setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicoreallergyintolerance setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
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

   public Iqicoreallergyintolerance setCode(CodeableConcept param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public boolean hasCode()
   {
      return adaptedClass.hasCode();
   }

   public boolean hasPatient()
   {
      return adaptedClass.hasPatient();
   }

   public Reference getPatient()
   {
      try
      {
         return adaptedClass.getPatient();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Patient", e);
      }
   }

   public Iqicoreallergyintolerance setPatient(Reference param)
   {
      adaptedClass.setPatient(param);
      return this;
   }

   public Patient getPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getPatientTarget();
   }

   public Iqicoreallergyintolerance setPatientTarget(Patient param)
   {
      adaptedClass.setPatientTarget(param);
      return this;
   }

   public qicorepatientAdapter getPatientAdapterTarget()
   {
      if (adaptedClass.getPatient().getResource() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Patient) adaptedClass
                     .getPatient().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreallergyintolerance setPatientAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.setPatientTarget(param.getAdaptee());
      return this;
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

   public Iqicoreallergyintolerance setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicoreallergyintolerance setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }
}