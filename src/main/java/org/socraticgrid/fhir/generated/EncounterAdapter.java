package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IEncounter;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.valueset.EncounterClassEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.resource.Organization;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.composite.DurationDt;
import ca.uhn.fhir.model.dstu2.resource.Appointment;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.valueset.EncounterStateEnum;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class EncounterAdapter implements IEncounter
{

   private Encounter adaptedClass = null;

   public EncounterAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Encounter();
   }

   public EncounterAdapter(Encounter adaptee)
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

   public String getClassElement()
   {
      return adaptedClass.getClassElement();
   }

   public IEncounter setClassElement(String param)
   {
      adaptedClass
            .setClassElement(ca.uhn.fhir.model.dstu2.valueset.EncounterClassEnum
                  .valueOf(param));
      return this;
   }

   public IEncounter setClassElement(EncounterClassEnum param)
   {
      adaptedClass.setClassElement(param);
      return this;
   }

   public BoundCodeDt<EncounterClassEnum> getClassElementElement()
   {
      return adaptedClass.getClassElementElement();
   }

   public IEncounter setClassElement(BoundCodeDt<EncounterClassEnum> param)
   {
      adaptedClass.setClassElement(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IEncounter setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IEncounter setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IEncounter addIdentifier(IdentifierDt param)
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

   public Encounter.Hospitalization getHospitalization()
   {
      return adaptedClass.getHospitalization();
   }

   public IEncounter setHospitalization(Encounter.Hospitalization param)
   {
      adaptedClass.setHospitalization(param);
      return this;
   }

   public Encounter getPartOfResource()
   {
      if (adaptedClass.getPartOf().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Encounter)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Encounter) adaptedClass
               .getPartOf().getResource();
      }
      else
      {
         return null;
      }
   }

   public IEncounter setPartOfResource(Encounter param)
   {
      adaptedClass.getPartOf().setResource(param);
      return this;
   }

   public List<Encounter.StatusHistory> getStatusHistory()
   {
      return adaptedClass.getStatusHistory();
   }

   public IEncounter setStatusHistory(List<Encounter.StatusHistory> param)
   {
      adaptedClass.setStatusHistory(param);
      return this;
   }

   public IEncounter addStatusHistory(Encounter.StatusHistory param)
   {
      adaptedClass.addStatusHistory(param);
      return this;
   }

   public Encounter.StatusHistory addStatusHistory()
   {
      ca.uhn.fhir.model.dstu2.resource.Encounter.StatusHistory item = new ca.uhn.fhir.model.dstu2.resource.Encounter.StatusHistory();
      adaptedClass.addStatusHistory(item);
      return item;
   }

   public Encounter.StatusHistory getStatusHistoryFirstRep()
   {
      return adaptedClass.getStatusHistoryFirstRep();
   }

   public List<Encounter.Participant> getParticipant()
   {
      return adaptedClass.getParticipant();
   }

   public IEncounter setParticipant(List<Encounter.Participant> param)
   {
      adaptedClass.setParticipant(param);
      return this;
   }

   public IEncounter addParticipant(Encounter.Participant param)
   {
      adaptedClass.addParticipant(param);
      return this;
   }

   public Encounter.Participant addParticipant()
   {
      ca.uhn.fhir.model.dstu2.resource.Encounter.Participant item = new ca.uhn.fhir.model.dstu2.resource.Encounter.Participant();
      adaptedClass.addParticipant(item);
      return item;
   }

   public Encounter.Participant getParticipantFirstRep()
   {
      return adaptedClass.getParticipantFirstRep();
   }

   public List<Encounter.Location> getLocation()
   {
      return adaptedClass.getLocation();
   }

   public IEncounter setLocation(List<Encounter.Location> param)
   {
      adaptedClass.setLocation(param);
      return this;
   }

   public IEncounter addLocation(Encounter.Location param)
   {
      adaptedClass.addLocation(param);
      return this;
   }

   public Encounter.Location addLocation()
   {
      ca.uhn.fhir.model.dstu2.resource.Encounter.Location item = new ca.uhn.fhir.model.dstu2.resource.Encounter.Location();
      adaptedClass.addLocation(item);
      return item;
   }

   public Encounter.Location getLocationFirstRep()
   {
      return adaptedClass.getLocationFirstRep();
   }

   public Organization getServiceProviderResource()
   {
      if (adaptedClass.getServiceProvider().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Organization)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Organization) adaptedClass
               .getServiceProvider().getResource();
      }
      else
      {
         return null;
      }
   }

   public IEncounter setServiceProviderResource(Organization param)
   {
      adaptedClass.getServiceProvider().setResource(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IEncounter setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IEncounter setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public CodeableConceptDt getPriority()
   {
      return adaptedClass.getPriority();
   }

   public IEncounter setPriority(CodeableConceptDt param)
   {
      adaptedClass.setPriority(param);
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

   public IEncounter setPatientResource(Patient param)
   {
      adaptedClass.getPatient().setResource(param);
      return this;
   }

   public DurationDt getLength()
   {
      return adaptedClass.getLength();
   }

   public IEncounter setLength(DurationDt param)
   {
      adaptedClass.setLength(param);
      return this;
   }

   public Appointment getAppointmentResource()
   {
      if (adaptedClass.getAppointment().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Appointment)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Appointment) adaptedClass
               .getAppointment().getResource();
      }
      else
      {
         return null;
      }
   }

   public IEncounter setAppointmentResource(Appointment param)
   {
      adaptedClass.getAppointment().setResource(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IEncounter setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IEncounter setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.EncounterStateEnum
                  .valueOf(param));
      return this;
   }

   public IEncounter setStatus(EncounterStateEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<EncounterStateEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IEncounter setStatus(BoundCodeDt<EncounterStateEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public PeriodDt getPeriod()
   {
      return adaptedClass.getPeriod();
   }

   public IEncounter setPeriod(PeriodDt param)
   {
      adaptedClass.setPeriod(param);
      return this;
   }
}