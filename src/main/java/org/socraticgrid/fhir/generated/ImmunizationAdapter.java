package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IImmunization;
import ca.uhn.fhir.model.dstu2.resource.Immunization;
import ca.uhn.fhir.model.dstu2.resource.Practitioner;
import ca.uhn.fhir.model.dstu2.resource.Location;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.primitive.DateDt;
import java.util.Date;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.dstu2.composite.SimpleQuantityDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.composite.AnnotationDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.Organization;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class ImmunizationAdapter implements IImmunization
{

   private Immunization adaptedClass = null;

   public ImmunizationAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Immunization();
   }

   public ImmunizationAdapter(Immunization adaptee)
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

   public Practitioner getRequesterResource()
   {
      if (adaptedClass.getRequester().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Practitioner)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Practitioner) adaptedClass
               .getRequester().getResource();
      }
      else
      {
         return null;
      }
   }

   public IImmunization setRequesterResource(Practitioner param)
   {
      adaptedClass.getRequester().setResource(param);
      return this;
   }

   public Location getLocationResource()
   {
      if (adaptedClass.getLocation().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Location)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Location) adaptedClass
               .getLocation().getResource();
      }
      else
      {
         return null;
      }
   }

   public IImmunization setLocationResource(Location param)
   {
      adaptedClass.getLocation().setResource(param);
      return this;
   }

   public StringDt getLotNumberElement()
   {
      return adaptedClass.getLotNumberElement();
   }

   public String getLotNumber()
   {
      return adaptedClass.getLotNumber();
   }

   public IImmunization setLotNumber(String param)
   {
      adaptedClass.setLotNumber(new ca.uhn.fhir.model.primitive.StringDt(
            param));
      return this;
   }

   public IImmunization setLotNumber(StringDt param)
   {
      adaptedClass.setLotNumber(param);
      return this;
   }

   public Immunization.Explanation getExplanation()
   {
      return adaptedClass.getExplanation();
   }

   public IImmunization setExplanation(Immunization.Explanation param)
   {
      adaptedClass.setExplanation(param);
      return this;
   }

   public DateDt getExpirationDateElement()
   {
      return adaptedClass.getExpirationDateElement();
   }

   public Date getExpirationDate()
   {
      return adaptedClass.getExpirationDate();
   }

   public IImmunization setExpirationDate(Date param)
   {
      adaptedClass.setExpirationDate(new ca.uhn.fhir.model.primitive.DateDt(
            param));
      return this;
   }

   public IImmunization setExpirationDate(DateDt param)
   {
      adaptedClass.setExpirationDate(param);
      return this;
   }

   public List<Immunization.VaccinationProtocol> getVaccinationProtocol()
   {
      return adaptedClass.getVaccinationProtocol();
   }

   public IImmunization setVaccinationProtocol(
         List<Immunization.VaccinationProtocol> param)
   {
      adaptedClass.setVaccinationProtocol(param);
      return this;
   }

   public IImmunization addVaccinationProtocol(
         Immunization.VaccinationProtocol param)
   {
      adaptedClass.addVaccinationProtocol(param);
      return this;
   }

   public Immunization.VaccinationProtocol addVaccinationProtocol()
   {
      ca.uhn.fhir.model.dstu2.resource.Immunization.VaccinationProtocol item = new ca.uhn.fhir.model.dstu2.resource.Immunization.VaccinationProtocol();
      adaptedClass.addVaccinationProtocol(item);
      return item;
   }

   public Immunization.VaccinationProtocol getVaccinationProtocolFirstRep()
   {
      return adaptedClass.getVaccinationProtocolFirstRep();
   }

   public List<Immunization.Reaction> getReaction()
   {
      return adaptedClass.getReaction();
   }

   public IImmunization setReaction(List<Immunization.Reaction> param)
   {
      adaptedClass.setReaction(param);
      return this;
   }

   public IImmunization addReaction(Immunization.Reaction param)
   {
      adaptedClass.addReaction(param);
      return this;
   }

   public Immunization.Reaction addReaction()
   {
      ca.uhn.fhir.model.dstu2.resource.Immunization.Reaction item = new ca.uhn.fhir.model.dstu2.resource.Immunization.Reaction();
      adaptedClass.addReaction(item);
      return item;
   }

   public Immunization.Reaction getReactionFirstRep()
   {
      return adaptedClass.getReactionFirstRep();
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IImmunization setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public BooleanDt getReportedElement()
   {
      return adaptedClass.getReportedElement();
   }

   public Boolean getReported()
   {
      return adaptedClass.getReported();
   }

   public IImmunization setReported(Boolean param)
   {
      adaptedClass.setReported(new ca.uhn.fhir.model.primitive.BooleanDt(
            param));
      return this;
   }

   public IImmunization setReported(BooleanDt param)
   {
      adaptedClass.setReported(param);
      return this;
   }

   public SimpleQuantityDt getDoseQuantity()
   {
      return adaptedClass.getDoseQuantity();
   }

   public IImmunization setDoseQuantity(SimpleQuantityDt param)
   {
      adaptedClass.setDoseQuantity(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IImmunization setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public Encounter getEncounterResource()
   {
      if (adaptedClass.getEncounter().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Encounter)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Encounter) adaptedClass
               .getEncounter().getResource();
      }
      else
      {
         return null;
      }
   }

   public IImmunization setEncounterResource(Encounter param)
   {
      adaptedClass.getEncounter().setResource(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IImmunization setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public DateTimeDt getDateElement()
   {
      return adaptedClass.getDateElement();
   }

   public Date getDate()
   {
      return adaptedClass.getDate();
   }

   public IImmunization setDate(Date param)
   {
      adaptedClass.setDate(new ca.uhn.fhir.model.primitive.DateTimeDt(param));
      return this;
   }

   public IImmunization setDate(DateTimeDt param)
   {
      adaptedClass.setDate(param);
      return this;
   }

   public CodeableConceptDt getRoute()
   {
      return adaptedClass.getRoute();
   }

   public IImmunization setRoute(CodeableConceptDt param)
   {
      adaptedClass.setRoute(param);
      return this;
   }

   public BooleanDt getWasNotGivenElement()
   {
      return adaptedClass.getWasNotGivenElement();
   }

   public Boolean getWasNotGiven()
   {
      return adaptedClass.getWasNotGiven();
   }

   public IImmunization setWasNotGiven(Boolean param)
   {
      adaptedClass.setWasNotGiven(new ca.uhn.fhir.model.primitive.BooleanDt(
            param));
      return this;
   }

   public IImmunization setWasNotGiven(BooleanDt param)
   {
      adaptedClass.setWasNotGiven(param);
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

   public IImmunization setPatientResource(Patient param)
   {
      adaptedClass.getPatient().setResource(param);
      return this;
   }

   public Practitioner getPerformerResource()
   {
      if (adaptedClass.getPerformer().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Practitioner)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Practitioner) adaptedClass
               .getPerformer().getResource();
      }
      else
      {
         return null;
      }
   }

   public IImmunization setPerformerResource(Practitioner param)
   {
      adaptedClass.getPerformer().setResource(param);
      return this;
   }

   public CodeableConceptDt getSite()
   {
      return adaptedClass.getSite();
   }

   public IImmunization setSite(CodeableConceptDt param)
   {
      adaptedClass.setSite(param);
      return this;
   }

   public CodeableConceptDt getVaccineCode()
   {
      return adaptedClass.getVaccineCode();
   }

   public IImmunization setVaccineCode(CodeableConceptDt param)
   {
      adaptedClass.setVaccineCode(param);
      return this;
   }

   public List<AnnotationDt> getNote()
   {
      return adaptedClass.getNote();
   }

   public IImmunization setNote(List<AnnotationDt> param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public IImmunization addNote(AnnotationDt param)
   {
      adaptedClass.addNote(param);
      return this;
   }

   public AnnotationDt addNote()
   {
      ca.uhn.fhir.model.dstu2.composite.AnnotationDt item = new ca.uhn.fhir.model.dstu2.composite.AnnotationDt();
      adaptedClass.addNote(item);
      return item;
   }

   public AnnotationDt getNoteFirstRep()
   {
      return adaptedClass.getNoteFirstRep();
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IImmunization setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public Organization getManufacturerResource()
   {
      if (adaptedClass.getManufacturer().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Organization)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Organization) adaptedClass
               .getManufacturer().getResource();
      }
      else
      {
         return null;
      }
   }

   public IImmunization setManufacturerResource(Organization param)
   {
      adaptedClass.getManufacturer().setResource(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IImmunization setStatus(String param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public CodeDt getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IImmunization setStatus(CodeDt param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IImmunization setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IImmunization addIdentifier(IdentifierDt param)
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
}