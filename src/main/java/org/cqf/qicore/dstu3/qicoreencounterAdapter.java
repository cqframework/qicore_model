package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.Encounter;
import org.hl7.fhir.dstu3.model.Coding;
import org.hl7.fhir.dstu3.model.Reference;
import java.util.List;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.CodeType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.Duration;
import org.hl7.fhir.dstu3.model.Appointment;
import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.Organization;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.*;

public class qicoreencounterAdapter implements Iqicoreencounter
{

   private Encounter adaptedClass;

   public qicoreencounterAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.Encounter();
   }

   public qicoreencounterAdapter(Encounter adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Encounter getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Encounter param)
   {
      this.adaptedClass = param;
   }

   public Coding getClass_()
   {
      try
      {
         return adaptedClass.getClass_();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Class_", e);
      }
   }

   public Iqicoreencounter setClass_(Coding param)
   {
      adaptedClass.setClass_(param);
      return this;
   }

   public boolean hasClass_()
   {
      return adaptedClass.hasClass_();
   }

   public boolean hasIncomingReferral()
   {
      return adaptedClass.hasIncomingReferral();
   }

   public List<Reference> getIncomingReferral()
   {
      return adaptedClass.getIncomingReferral();
   }

   public boolean hasIndication()
   {
      return adaptedClass.hasIndication();
   }

   public List<Condition> getIndicationConditionTarget() {
		List<org.hl7.fhir.dstu3.model.Condition> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getIndicationTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Condition) resource);
		}
		return items;
	}

   public List<Reference> getIndication()
   {
      return adaptedClass.getIndication();
   }

   public List<Procedure> getIndicationProcedureTarget() {
		List<org.hl7.fhir.dstu3.model.Procedure> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getIndicationTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Procedure) resource);
		}
		return items;
	}

   public boolean hasEpisodeOfCare()
   {
      return adaptedClass.hasEpisodeOfCare();
   }

   public List<Reference> getEpisodeOfCare()
   {
      return adaptedClass.getEpisodeOfCare();
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

   public Iqicoreencounter setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicoreencounter addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
   }

   public List<CodeableConcept> getType()
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

   public Iqicoreencounter setType(List<CodeableConcept> param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public boolean hasType()
   {
      return adaptedClass.hasType();
   }

   public Iqicoreencounter addType(CodeableConcept param)
   {
      adaptedClass.addType(param);
      return this;
   }

   public CodeableConcept addType()
   {
      return adaptedClass.addType();
   }

   public Encounter.EncounterHospitalizationComponent getHospitalization()
   {
      try
      {
         return adaptedClass.getHospitalization();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Hospitalization", e);
      }
   }

   public qicoreencounterAdapter setHospitalization(
         Encounter.EncounterHospitalizationComponent param)
   {
      adaptedClass.setHospitalization(param);
      return this;
   }

   public boolean hasHospitalization()
   {
      return adaptedClass.hasHospitalization();
   }

   public List<qicoreencounterRelatedConditionAdapter> getRelatedCondition() {
		List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
				.getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/encounter-relatedCondition");
		List<qicoreencounterRelatedConditionAdapter> returnList = new java.util.ArrayList<>();
		for (org.hl7.fhir.dstu3.model.Extension extension : extensions) {
			qicoreencounterRelatedConditionAdapter udt = new qicoreencounterRelatedConditionAdapter();
			udt.setRootObjectExtension(extension);
			returnList.add(udt);
		}
		return returnList;
	}

   public Iqicoreencounter setRelatedCondition(
         List<qicoreencounterRelatedConditionAdapter> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < ((List<qicoreencounterRelatedConditionAdapter>) param)
               .size(); index++)
         {
            adaptedClass.addExtension(param.get(index)
                  .getRootObjectExtension());
         }
      }
      return this;
   }

   public CodeableConcept getReasonCancelled()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/encounter-reasonCancelled");
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
               "More than one extension exists for reasonCancelled");
      }
   }

   public Iqicoreencounter setReasonCancelled(CodeableConcept param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/encounter-reasonCancelled")
            .setValue(param);
      return this;
   }

   public List<Encounter.EncounterParticipantComponent> getParticipant()
   {
      try
      {
         return adaptedClass.getParticipant();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Participant", e);
      }
   }

   public qicoreencounterAdapter setParticipant(
         List<Encounter.EncounterParticipantComponent> param)
   {
      adaptedClass.setParticipant(param);
      return this;
   }

   public boolean hasParticipant()
   {
      return adaptedClass.hasParticipant();
   }

   public qicoreencounterAdapter addParticipant(
         Encounter.EncounterParticipantComponent param)
   {
      adaptedClass.addParticipant(param);
      return this;
   }

   public Encounter.EncounterParticipantComponent addParticipant()
   {
      return adaptedClass.addParticipant();
   }

   public List<Encounter.EncounterStatusHistoryComponent> getStatusHistory()
   {
      try
      {
         return adaptedClass.getStatusHistory();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting StatusHistory", e);
      }
   }

   public qicoreencounterAdapter setStatusHistory(
         List<Encounter.EncounterStatusHistoryComponent> param)
   {
      adaptedClass.setStatusHistory(param);
      return this;
   }

   public boolean hasStatusHistory()
   {
      return adaptedClass.hasStatusHistory();
   }

   public qicoreencounterAdapter addStatusHistory(
         Encounter.EncounterStatusHistoryComponent param)
   {
      adaptedClass.addStatusHistory(param);
      return this;
   }

   public Encounter.EncounterStatusHistoryComponent addStatusHistory()
   {
      return adaptedClass.addStatusHistory();
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

   public Iqicoreencounter setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicoreencounter addContained(Resource param)
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

   public Iqicoreencounter setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicoreencounter setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public List<CodeableConcept> getReason()
   {
      try
      {
         return adaptedClass.getReason();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Reason", e);
      }
   }

   public Iqicoreencounter setReason(List<CodeableConcept> param)
   {
      adaptedClass.setReason(param);
      return this;
   }

   public boolean hasReason()
   {
      return adaptedClass.hasReason();
   }

   public Iqicoreencounter addReason(CodeableConcept param)
   {
      adaptedClass.addReason(param);
      return this;
   }

   public CodeableConcept addReason()
   {
      return adaptedClass.addReason();
   }

   public Duration getLength()
   {
      try
      {
         return adaptedClass.getLength();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Length", e);
      }
   }

   public Iqicoreencounter setLength(Duration param)
   {
      adaptedClass.setLength(param);
      return this;
   }

   public boolean hasLength()
   {
      return adaptedClass.hasLength();
   }

   public List<Encounter.EncounterLocationComponent> getLocation()
   {
      try
      {
         return adaptedClass.getLocation();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Location", e);
      }
   }

   public qicoreencounterAdapter setLocation(
         List<Encounter.EncounterLocationComponent> param)
   {
      adaptedClass.setLocation(param);
      return this;
   }

   public boolean hasLocation()
   {
      return adaptedClass.hasLocation();
   }

   public qicoreencounterAdapter addLocation(
         Encounter.EncounterLocationComponent param)
   {
      adaptedClass.addLocation(param);
      return this;
   }

   public Encounter.EncounterLocationComponent addLocation()
   {
      return adaptedClass.addLocation();
   }

   public boolean hasAppointment()
   {
      return adaptedClass.hasAppointment();
   }

   public Reference getAppointment()
   {
      try
      {
         return adaptedClass.getAppointment();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Appointment", e);
      }
   }

   public Iqicoreencounter setAppointment(Reference param)
   {
      adaptedClass.setAppointment(param);
      return this;
   }

   public Appointment getAppointmentTarget()
   {
      return (org.hl7.fhir.dstu3.model.Appointment) adaptedClass
            .getAppointmentTarget();
   }

   public Iqicoreencounter setAppointmentTarget(Appointment param)
   {
      adaptedClass.setAppointmentTarget(param);
      return this;
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

   public Iqicoreencounter setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicoreencounter setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
      return this;
   }

   public Period getPeriod()
   {
      try
      {
         return adaptedClass.getPeriod();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Period", e);
      }
   }

   public Iqicoreencounter setPeriod(Period param)
   {
      adaptedClass.setPeriod(param);
      return this;
   }

   public boolean hasPeriod()
   {
      return adaptedClass.hasPeriod();
   }

   public boolean hasAccount()
   {
      return adaptedClass.hasAccount();
   }

   public List<Reference> getAccount()
   {
      return adaptedClass.getAccount();
   }

   public boolean hasPartOf()
   {
      return adaptedClass.hasPartOf();
   }

   public Reference getPartOf()
   {
      try
      {
         return adaptedClass.getPartOf();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting PartOf", e);
      }
   }

   public Iqicoreencounter setPartOf(Reference param)
   {
      adaptedClass.setPartOf(param);
      return this;
   }

   public Encounter getPartOfTarget()
   {
      return (org.hl7.fhir.dstu3.model.Encounter) adaptedClass
            .getPartOfTarget();
   }

   public Iqicoreencounter setPartOfTarget(Encounter param)
   {
      adaptedClass.setPartOfTarget(param);
      return this;
   }

   public qicoreencounterAdapter getPartOfAdapterTarget()
   {
      if (adaptedClass.getPartOf().getResource() instanceof org.hl7.fhir.dstu3.model.Encounter)
      {
         qicoreencounterAdapter profiledType = new qicoreencounterAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Encounter) adaptedClass
                     .getPartOf().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreencounter setPartOfAdapterTarget(qicoreencounterAdapter param)
   {
      adaptedClass.setPartOfTarget(param.getAdaptee());
      return this;
   }

   public boolean hasServiceProvider()
   {
      return adaptedClass.hasServiceProvider();
   }

   public Reference getServiceProvider()
   {
      try
      {
         return adaptedClass.getServiceProvider();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ServiceProvider", e);
      }
   }

   public Iqicoreencounter setServiceProvider(Reference param)
   {
      adaptedClass.setServiceProvider(param);
      return this;
   }

   public Organization getServiceProviderTarget()
   {
      return (org.hl7.fhir.dstu3.model.Organization) adaptedClass
            .getServiceProviderTarget();
   }

   public Iqicoreencounter setServiceProviderTarget(Organization param)
   {
      adaptedClass.setServiceProviderTarget(param);
      return this;
   }

   public qicoreorganizationAdapter getServiceProviderAdapterTarget()
   {
      if (adaptedClass.getServiceProvider().getResource() instanceof org.hl7.fhir.dstu3.model.Organization)
      {
         qicoreorganizationAdapter profiledType = new qicoreorganizationAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Organization) adaptedClass
                     .getServiceProvider().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreencounter setServiceProviderAdapterTarget(
         qicoreorganizationAdapter param)
   {
      adaptedClass.setServiceProviderTarget(param.getAdaptee());
      return this;
   }

   public CodeableConcept getPriority()
   {
      try
      {
         return adaptedClass.getPriority();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Priority", e);
      }
   }

   public Iqicoreencounter setPriority(CodeableConcept param)
   {
      adaptedClass.setPriority(param);
      return this;
   }

   public boolean hasPriority()
   {
      return adaptedClass.hasPriority();
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

   public Iqicoreencounter setPatient(Reference param)
   {
      adaptedClass.setPatient(param);
      return this;
   }

   public Patient getPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getPatientTarget();
   }

   public Iqicoreencounter setPatientTarget(Patient param)
   {
      adaptedClass.setPatientTarget(param);
      return this;
   }

   public qicorepatientAdapter getPatientAdapterTarget()
   {
      if (adaptedClass.getPatient().getResource() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         qicorepatientAdapter profiledType = new qicorepatientAdapter();
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

   public Iqicoreencounter setPatientAdapterTarget(qicorepatientAdapter param)
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

   public Iqicoreencounter setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicoreencounter setId(String param)
   {
      adaptedClass.setId(param);
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

   public Encounter.EncounterStatus getStatus()
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

   public Enumeration<Encounter.EncounterStatus> getStatusElement()
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

   public Iqicoreencounter setStatus(Encounter.EncounterStatus param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public Iqicoreencounter setStatusElement(
         Enumeration<Encounter.EncounterStatus> param)
   {
      adaptedClass.setStatusElement(param);
      return this;
   }
}