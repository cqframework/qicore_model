package org.socraticgrid.fhir.dstu3.generated;

import org.socraticgrid.fhir.dstu3.generated.Iqicoreimmunization;
import org.hl7.fhir.dstu3.model.Immunization;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.Location;
import org.hl7.fhir.dstu3.model.StringType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.DateType;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.dstu3.model.BooleanType;
import java.lang.Boolean;
import org.hl7.fhir.dstu3.model.SimpleQuantity;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.Encounter;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Annotation;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.Organization;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.*;
import ca.uhn.fhir.model.api.ExtensionDt;

public class qicoreimmunizationAdapter implements Iqicoreimmunization
{

   private Immunization adaptedClass;

   public qicoreimmunizationAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.Immunization();
   }

   public qicoreimmunizationAdapter(Immunization adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Immunization getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Immunization param)
   {
      this.adaptedClass = param;
   }

   public boolean hasRequester()
   {
      return adaptedClass.hasRequester();
   }

   public Reference getRequester()
   {
      try
      {
         return adaptedClass.getRequester();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Requester", e);
      }
   }

   public Iqicoreimmunization setRequester(Reference param)
   {
      adaptedClass.setRequester(param);
      return this;
   }

   public Practitioner getRequesterTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
            .getRequesterTarget();
   }

   public Iqicoreimmunization setRequesterTarget(Practitioner param)
   {
      adaptedClass.setRequesterTarget(param);
      return this;
   }

   public qicorepractitionerAdapter getRequesterAdapterTarget()
   {
      if (adaptedClass.getRequester().getResource() instanceof org.hl7.fhir.dstu3.model.Practitioner)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorepractitionerAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorepractitionerAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
                     .getRequester().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreimmunization setRequesterAdapterTarget(
         qicorepractitionerAdapter param)
   {
      adaptedClass.setRequesterTarget(param.getAdaptee());
      return this;
   }

   public boolean hasLocation()
   {
      return adaptedClass.hasLocation();
   }

   public Reference getLocation()
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

   public Iqicoreimmunization setLocation(Reference param)
   {
      adaptedClass.setLocation(param);
      return this;
   }

   public Location getLocationTarget()
   {
      return (org.hl7.fhir.dstu3.model.Location) adaptedClass
            .getLocationTarget();
   }

   public Iqicoreimmunization setLocationTarget(Location param)
   {
      adaptedClass.setLocationTarget(param);
      return this;
   }

   public qicorelocationAdapter getLocationAdapterTarget()
   {
      if (adaptedClass.getLocation().getResource() instanceof org.hl7.fhir.dstu3.model.Location)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorelocationAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorelocationAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Location) adaptedClass
                     .getLocation().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreimmunization setLocationAdapterTarget(
         qicorelocationAdapter param)
   {
      adaptedClass.setLocationTarget(param.getAdaptee());
      return this;
   }

   public boolean hasLotNumber()
   {
      return adaptedClass.hasLotNumber();
   }

   public boolean hasLotNumberElement()
   {
      return adaptedClass.hasLotNumberElement();
   }

   public StringType getLotNumberElement()
   {
      try
      {
         return adaptedClass.getLotNumberElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting LotNumberElement", e);
      }
   }

   public String getLotNumber()
   {
      try
      {
         return adaptedClass.getLotNumber();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting LotNumber", e);
      }
   }

   public Iqicoreimmunization setLotNumberElement(StringType param)
   {
      adaptedClass.setLotNumberElement(param);
      return this;
   }

   public Iqicoreimmunization setLotNumber(String param)
   {
      adaptedClass.setLotNumber(param);
      return this;
   }

   public Immunization.ImmunizationExplanationComponent getExplanation()
   {
      try
      {
         return adaptedClass.getExplanation();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Explanation", e);
      }
   }

   public qicoreimmunizationAdapter setExplanation(
         Immunization.ImmunizationExplanationComponent param)
   {
      adaptedClass.setExplanation(param);
      return this;
   }

   public boolean hasExplanation()
   {
      return adaptedClass.hasExplanation();
   }

   public boolean hasExpirationDate()
   {
      return adaptedClass.hasExpirationDate();
   }

   public boolean hasExpirationDateElement()
   {
      return adaptedClass.hasExpirationDateElement();
   }

   public DateType getExpirationDateElement()
   {
      try
      {
         return adaptedClass.getExpirationDateElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ExpirationDateElement", e);
      }
   }

   public Date getExpirationDate()
   {
      try
      {
         return adaptedClass.getExpirationDate();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ExpirationDate", e);
      }
   }

   public Iqicoreimmunization setExpirationDateElement(DateType param)
   {
      adaptedClass.setExpirationDateElement(param);
      return this;
   }

   public Iqicoreimmunization setExpirationDate(Date param)
   {
      adaptedClass.setExpirationDate(param);
      return this;
   }

   public List<Immunization.ImmunizationVaccinationProtocolComponent> getVaccinationProtocol()
   {
      try
      {
         return adaptedClass.getVaccinationProtocol();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting VaccinationProtocol", e);
      }
   }

   public qicoreimmunizationAdapter setVaccinationProtocol(
         List<Immunization.ImmunizationVaccinationProtocolComponent> param)
   {
      adaptedClass.setVaccinationProtocol(param);
      return this;
   }

   public boolean hasVaccinationProtocol()
   {
      return adaptedClass.hasVaccinationProtocol();
   }

   public qicoreimmunizationAdapter addVaccinationProtocol(
         Immunization.ImmunizationVaccinationProtocolComponent param)
   {
      adaptedClass.addVaccinationProtocol(param);
      return this;
   }

   public Immunization.ImmunizationVaccinationProtocolComponent addVaccinationProtocol()
   {
      return adaptedClass.addVaccinationProtocol();
   }

   public List<Immunization.ImmunizationReactionComponent> getReaction()
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

   public qicoreimmunizationAdapter setReaction(
         List<Immunization.ImmunizationReactionComponent> param)
   {
      adaptedClass.setReaction(param);
      return this;
   }

   public boolean hasReaction()
   {
      return adaptedClass.hasReaction();
   }

   public qicoreimmunizationAdapter addReaction(
         Immunization.ImmunizationReactionComponent param)
   {
      adaptedClass.addReaction(param);
      return this;
   }

   public Immunization.ImmunizationReactionComponent addReaction()
   {
      return adaptedClass.addReaction();
   }

   public boolean hasReported()
   {
      return adaptedClass.hasReported();
   }

   public boolean hasReportedElement()
   {
      return adaptedClass.hasReportedElement();
   }

   public BooleanType getReportedElement()
   {
      try
      {
         return adaptedClass.getReportedElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ReportedElement", e);
      }
   }

   public Boolean getReported()
   {
      try
      {
         return adaptedClass.getReported();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Reported", e);
      }
   }

   public Iqicoreimmunization setReportedElement(BooleanType param)
   {
      adaptedClass.setReportedElement(param);
      return this;
   }

   public Iqicoreimmunization setReported(Boolean param)
   {
      adaptedClass.setReported(param);
      return this;
   }

   public SimpleQuantity getDoseQuantity()
   {
      try
      {
         return adaptedClass.getDoseQuantity();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting DoseQuantity", e);
      }
   }

   public Iqicoreimmunization setDoseQuantity(SimpleQuantity param)
   {
      adaptedClass.setDoseQuantity(param);
      return this;
   }

   public boolean hasDoseQuantity()
   {
      return adaptedClass.hasDoseQuantity();
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

   public Iqicoreimmunization setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicoreimmunization setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public boolean hasEncounter()
   {
      return adaptedClass.hasEncounter();
   }

   public Reference getEncounter()
   {
      try
      {
         return adaptedClass.getEncounter();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Encounter", e);
      }
   }

   public Iqicoreimmunization setEncounter(Reference param)
   {
      adaptedClass.setEncounter(param);
      return this;
   }

   public Encounter getEncounterTarget()
   {
      return (org.hl7.fhir.dstu3.model.Encounter) adaptedClass
            .getEncounterTarget();
   }

   public Iqicoreimmunization setEncounterTarget(Encounter param)
   {
      adaptedClass.setEncounterTarget(param);
      return this;
   }

   public qicoreencounterAdapter getEncounterAdapterTarget()
   {
      if (adaptedClass.getEncounter().getResource() instanceof org.hl7.fhir.dstu3.model.Encounter)
      {
         org.socraticgrid.fhir.dstu3.generated.qicoreencounterAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicoreencounterAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Encounter) adaptedClass
                     .getEncounter().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreimmunization setEncounterAdapterTarget(
         qicoreencounterAdapter param)
   {
      adaptedClass.setEncounterTarget(param.getAdaptee());
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

   public Iqicoreimmunization setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicoreimmunization addContained(Resource param)
   {
      adaptedClass.addContained(param);
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

   public Iqicoreimmunization setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicoreimmunization setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
      return this;
   }

   public CodeableConcept getRoute()
   {
      try
      {
         return adaptedClass.getRoute();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Route", e);
      }
   }

   public Iqicoreimmunization setRoute(CodeableConcept param)
   {
      adaptedClass.setRoute(param);
      return this;
   }

   public boolean hasRoute()
   {
      return adaptedClass.hasRoute();
   }

   public boolean hasWasNotGiven()
   {
      return adaptedClass.hasWasNotGiven();
   }

   public boolean hasWasNotGivenElement()
   {
      return adaptedClass.hasWasNotGivenElement();
   }

   public BooleanType getWasNotGivenElement()
   {
      try
      {
         return adaptedClass.getWasNotGivenElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting WasNotGivenElement", e);
      }
   }

   public Boolean getWasNotGiven()
   {
      try
      {
         return adaptedClass.getWasNotGiven();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting WasNotGiven", e);
      }
   }

   public Iqicoreimmunization setWasNotGivenElement(BooleanType param)
   {
      adaptedClass.setWasNotGivenElement(param);
      return this;
   }

   public Iqicoreimmunization setWasNotGiven(Boolean param)
   {
      adaptedClass.setWasNotGiven(param);
      return this;
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

   public Iqicoreimmunization setPatient(Reference param)
   {
      adaptedClass.setPatient(param);
      return this;
   }

   public Patient getPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getPatientTarget();
   }

   public Iqicoreimmunization setPatientTarget(Patient param)
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

   public Iqicoreimmunization setPatientAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.setPatientTarget(param.getAdaptee());
      return this;
   }

   public boolean hasPerformer()
   {
      return adaptedClass.hasPerformer();
   }

   public Reference getPerformer()
   {
      try
      {
         return adaptedClass.getPerformer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Performer", e);
      }
   }

   public Iqicoreimmunization setPerformer(Reference param)
   {
      adaptedClass.setPerformer(param);
      return this;
   }

   public Practitioner getPerformerTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
            .getPerformerTarget();
   }

   public Iqicoreimmunization setPerformerTarget(Practitioner param)
   {
      adaptedClass.setPerformerTarget(param);
      return this;
   }

   public qicorepractitionerAdapter getPerformerAdapterTarget()
   {
      if (adaptedClass.getPerformer().getResource() instanceof org.hl7.fhir.dstu3.model.Practitioner)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorepractitionerAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorepractitionerAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
                     .getPerformer().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreimmunization setPerformerAdapterTarget(
         qicorepractitionerAdapter param)
   {
      adaptedClass.setPerformerTarget(param.getAdaptee());
      return this;
   }

   public CodeableConcept getSite()
   {
      try
      {
         return adaptedClass.getSite();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Site", e);
      }
   }

   public Iqicoreimmunization setSite(CodeableConcept param)
   {
      adaptedClass.setSite(param);
      return this;
   }

   public boolean hasSite()
   {
      return adaptedClass.hasSite();
   }

   public CodeableConcept getVaccineCode()
   {
      try
      {
         return adaptedClass.getVaccineCode();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting VaccineCode", e);
      }
   }

   public Iqicoreimmunization setVaccineCode(CodeableConcept param)
   {
      adaptedClass.setVaccineCode(param);
      return this;
   }

   public boolean hasVaccineCode()
   {
      return adaptedClass.hasVaccineCode();
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

   public Iqicoreimmunization setNote(List<Annotation> param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public boolean hasNote()
   {
      return adaptedClass.hasNote();
   }

   public Iqicoreimmunization addNote(Annotation param)
   {
      adaptedClass.addNote(param);
      return this;
   }

   public Annotation addNote()
   {
      return adaptedClass.addNote();
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

   public Iqicoreimmunization setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicoreimmunization setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public boolean hasManufacturer()
   {
      return adaptedClass.hasManufacturer();
   }

   public Reference getManufacturer()
   {
      try
      {
         return adaptedClass.getManufacturer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Manufacturer", e);
      }
   }

   public Iqicoreimmunization setManufacturer(Reference param)
   {
      adaptedClass.setManufacturer(param);
      return this;
   }

   public Organization getManufacturerTarget()
   {
      return (org.hl7.fhir.dstu3.model.Organization) adaptedClass
            .getManufacturerTarget();
   }

   public Iqicoreimmunization setManufacturerTarget(Organization param)
   {
      adaptedClass.setManufacturerTarget(param);
      return this;
   }

   public qicoreorganizationAdapter getManufacturerAdapterTarget()
   {
      if (adaptedClass.getManufacturer().getResource() instanceof org.hl7.fhir.dstu3.model.Organization)
      {
         org.socraticgrid.fhir.dstu3.generated.qicoreorganizationAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicoreorganizationAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Organization) adaptedClass
                     .getManufacturer().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreimmunization setManufacturerAdapterTarget(
         qicoreorganizationAdapter param)
   {
      adaptedClass.setManufacturerTarget(param.getAdaptee());
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

   public Immunization.ImmunizationStatus getStatus()
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

   public Enumeration<Immunization.ImmunizationStatus> getStatusElement()
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

   public Iqicoreimmunization setStatus(Immunization.ImmunizationStatus param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public Iqicoreimmunization setStatusElement(
         Enumeration<Immunization.ImmunizationStatus> param)
   {
      adaptedClass.setStatusElement(param);
      return this;
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

   public Iqicoreimmunization setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicoreimmunization addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
   }
}