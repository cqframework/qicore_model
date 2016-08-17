package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IQICoreImmunization;
import ca.uhn.fhir.model.dstu2.resource.Immunization;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.primitive.DateDt;
import java.util.Date;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.dstu2.composite.SimpleQuantityDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.AnnotationDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreImmunizationAdapter implements IQICoreImmunization
{

   private Immunization adaptedClass = null;

   public QICoreImmunizationAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Immunization();
   }

   public QICoreImmunizationAdapter(Immunization adaptee)
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

   public QICorePractitionerAdapter getRequesterResource()
   {
      if (adaptedClass.getRequester().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Practitioner)
      {
         org.socraticgrid.fhir.generated.QICorePractitionerAdapter profiledType = new org.socraticgrid.fhir.generated.QICorePractitionerAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Practitioner) adaptedClass
                     .getRequester().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreImmunization setRequesterResource(
         QICorePractitionerAdapter param)
   {
      adaptedClass.getRequester().setResource(param.getAdaptee());
      return this;
   }

   public QICoreLocationAdapter getLocationResource()
   {
      if (adaptedClass.getLocation().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Location)
      {
         org.socraticgrid.fhir.generated.QICoreLocationAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreLocationAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Location) adaptedClass
                     .getLocation().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreImmunization setLocationResource(QICoreLocationAdapter param)
   {
      adaptedClass.getLocation().setResource(param.getAdaptee());
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

   public IQICoreImmunization setLotNumber(String param)
   {
      adaptedClass.setLotNumber(new ca.uhn.fhir.model.primitive.StringDt(
            param));
      return this;
   }

   public IQICoreImmunization setLotNumber(StringDt param)
   {
      adaptedClass.setLotNumber(param);
      return this;
   }

   public Immunization.Explanation getExplanation()
   {
      return adaptedClass.getExplanation();
   }

   public IQICoreImmunization setExplanation(Immunization.Explanation param)
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

   public IQICoreImmunization setExpirationDate(Date param)
   {
      adaptedClass.setExpirationDate(new ca.uhn.fhir.model.primitive.DateDt(
            param));
      return this;
   }

   public IQICoreImmunization setExpirationDate(DateDt param)
   {
      adaptedClass.setExpirationDate(param);
      return this;
   }

   public List<Immunization.VaccinationProtocol> getVaccinationProtocol()
   {
      return adaptedClass.getVaccinationProtocol();
   }

   public IQICoreImmunization setVaccinationProtocol(
         List<Immunization.VaccinationProtocol> param)
   {
      adaptedClass.setVaccinationProtocol(param);
      return this;
   }

   public IQICoreImmunization addVaccinationProtocol(
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

   public IQICoreImmunization setReaction(List<Immunization.Reaction> param)
   {
      adaptedClass.setReaction(param);
      return this;
   }

   public IQICoreImmunization addReaction(Immunization.Reaction param)
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

   public IQICoreImmunization setText(NarrativeDt param)
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

   public IQICoreImmunization setReported(Boolean param)
   {
      adaptedClass.setReported(new ca.uhn.fhir.model.primitive.BooleanDt(
            param));
      return this;
   }

   public IQICoreImmunization setReported(BooleanDt param)
   {
      adaptedClass.setReported(param);
      return this;
   }

   public SimpleQuantityDt getDoseQuantity()
   {
      return adaptedClass.getDoseQuantity();
   }

   public IQICoreImmunization setDoseQuantity(SimpleQuantityDt param)
   {
      adaptedClass.setDoseQuantity(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IQICoreImmunization setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public QICoreEncounterAdapter getEncounterResource()
   {
      if (adaptedClass.getEncounter().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Encounter)
      {
         org.socraticgrid.fhir.generated.QICoreEncounterAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreEncounterAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Encounter) adaptedClass
                     .getEncounter().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreImmunization setEncounterResource(QICoreEncounterAdapter param)
   {
      adaptedClass.getEncounter().setResource(param.getAdaptee());
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IQICoreImmunization setContained(ContainedDt param)
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

   public IQICoreImmunization setDate(Date param)
   {
      adaptedClass.setDate(new ca.uhn.fhir.model.primitive.DateTimeDt(param));
      return this;
   }

   public IQICoreImmunization setDate(DateTimeDt param)
   {
      adaptedClass.setDate(param);
      return this;
   }

   public CodeableConceptDt getRoute()
   {
      return adaptedClass.getRoute();
   }

   public IQICoreImmunization setRoute(CodeableConceptDt param)
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

   public IQICoreImmunization setWasNotGiven(Boolean param)
   {
      adaptedClass.setWasNotGiven(new ca.uhn.fhir.model.primitive.BooleanDt(
            param));
      return this;
   }

   public IQICoreImmunization setWasNotGiven(BooleanDt param)
   {
      adaptedClass.setWasNotGiven(param);
      return this;
   }

   public QICorePatientAdapter getPatientResource()
   {
      if (adaptedClass.getPatient().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Patient)
      {
         org.socraticgrid.fhir.generated.QICorePatientAdapter profiledType = new org.socraticgrid.fhir.generated.QICorePatientAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Patient) adaptedClass
                     .getPatient().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreImmunization setPatientResource(QICorePatientAdapter param)
   {
      adaptedClass.getPatient().setResource(param.getAdaptee());
      return this;
   }

   public QICorePractitionerAdapter getPerformerResource()
   {
      if (adaptedClass.getPerformer().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Practitioner)
      {
         org.socraticgrid.fhir.generated.QICorePractitionerAdapter profiledType = new org.socraticgrid.fhir.generated.QICorePractitionerAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Practitioner) adaptedClass
                     .getPerformer().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreImmunization setPerformerResource(
         QICorePractitionerAdapter param)
   {
      adaptedClass.getPerformer().setResource(param.getAdaptee());
      return this;
   }

   public CodeableConceptDt getSite()
   {
      return adaptedClass.getSite();
   }

   public IQICoreImmunization setSite(CodeableConceptDt param)
   {
      adaptedClass.setSite(param);
      return this;
   }

   public CodeableConceptDt getVaccineCode()
   {
      return adaptedClass.getVaccineCode();
   }

   public IQICoreImmunization setVaccineCode(CodeableConceptDt param)
   {
      adaptedClass.setVaccineCode(param);
      return this;
   }

   public List<AnnotationDt> getNote()
   {
      return adaptedClass.getNote();
   }

   public IQICoreImmunization setNote(List<AnnotationDt> param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public IQICoreImmunization addNote(AnnotationDt param)
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

   public IQICoreImmunization setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public QICoreOrganizationAdapter getManufacturerResource()
   {
      if (adaptedClass.getManufacturer().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Organization)
      {
         org.socraticgrid.fhir.generated.QICoreOrganizationAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreOrganizationAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Organization) adaptedClass
                     .getManufacturer().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreImmunization setManufacturerResource(
         QICoreOrganizationAdapter param)
   {
      adaptedClass.getManufacturer().setResource(param.getAdaptee());
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IQICoreImmunization setStatus(String param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public CodeDt getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IQICoreImmunization setStatus(CodeDt param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IQICoreImmunization setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IQICoreImmunization addIdentifier(IdentifierDt param)
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