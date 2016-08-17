package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IQICoreEncounter;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.valueset.EncounterClassEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import org.socraticgrid.fhir.generated.QICoreEncounterRelatedCondition;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.composite.DurationDt;
import ca.uhn.fhir.model.dstu2.resource.Appointment;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.valueset.EncounterStateEnum;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreEncounterAdapter implements IQICoreEncounter
{

   private Encounter adaptedClass = null;

   public QICoreEncounterAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Encounter();
   }

   public QICoreEncounterAdapter(Encounter adaptee)
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

   public IQICoreEncounter setClassElement(String param)
   {
      adaptedClass
            .setClassElement(ca.uhn.fhir.model.dstu2.valueset.EncounterClassEnum
                  .valueOf(param));
      return this;
   }

   public IQICoreEncounter setClassElement(EncounterClassEnum param)
   {
      adaptedClass.setClassElement(param);
      return this;
   }

   public BoundCodeDt<EncounterClassEnum> getClassElementElement()
   {
      return adaptedClass.getClassElementElement();
   }

   public IQICoreEncounter setClassElement(
         BoundCodeDt<EncounterClassEnum> param)
   {
      adaptedClass.setClassElement(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IQICoreEncounter setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IQICoreEncounter setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IQICoreEncounter addIdentifier(IdentifierDt param)
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

   public IQICoreEncounter setHospitalization(Encounter.Hospitalization param)
   {
      adaptedClass.setHospitalization(param);
      return this;
   }

   public List<QICoreEncounterRelatedCondition> getRelatedCondition() {
		List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
				.getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/encounter-relatedCondition");
		List<org.socraticgrid.fhir.generated.QICoreEncounterRelatedCondition> returnList = new java.util.ArrayList<>();
		for (ca.uhn.fhir.model.api.ExtensionDt extension : extensions) {
			org.socraticgrid.fhir.generated.QICoreEncounterRelatedCondition udt = new org.socraticgrid.fhir.generated.QICoreEncounterRelatedCondition();
			udt.setRootObjectExtension(extension);
			returnList.add(udt);
		}
		return returnList;
	}

   public IQICoreEncounter setRelatedCondition(
         List<QICoreEncounterRelatedCondition> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < ((List<org.socraticgrid.fhir.generated.QICoreEncounterRelatedCondition>) param)
               .size(); index++)
         {
            adaptedClass.addUndeclaredExtension(param.get(index)
                  .getRootObjectExtension());
         }
      }
      return this;
   }

   public CodeableConceptDt getReasonCancelled()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/encounter-reasonCancelled");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt) extensions
               .get(0).getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for reasonCancelled");
      }
   }

   public IQICoreEncounter setReasonCancelled(CodeableConceptDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/encounter-reasonCancelled",
                  param);
      return this;
   }

   public List<Encounter.Participant> getParticipant()
   {
      return adaptedClass.getParticipant();
   }

   public IQICoreEncounter setParticipant(List<Encounter.Participant> param)
   {
      adaptedClass.setParticipant(param);
      return this;
   }

   public IQICoreEncounter addParticipant(Encounter.Participant param)
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

   public List<Encounter.StatusHistory> getStatusHistory()
   {
      return adaptedClass.getStatusHistory();
   }

   public IQICoreEncounter setStatusHistory(List<Encounter.StatusHistory> param)
   {
      adaptedClass.setStatusHistory(param);
      return this;
   }

   public IQICoreEncounter addStatusHistory(Encounter.StatusHistory param)
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

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IQICoreEncounter setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IQICoreEncounter setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public DurationDt getLength()
   {
      return adaptedClass.getLength();
   }

   public IQICoreEncounter setLength(DurationDt param)
   {
      adaptedClass.setLength(param);
      return this;
   }

   public List<Encounter.Location> getLocation()
   {
      return adaptedClass.getLocation();
   }

   public IQICoreEncounter setLocation(List<Encounter.Location> param)
   {
      adaptedClass.setLocation(param);
      return this;
   }

   public IQICoreEncounter addLocation(Encounter.Location param)
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

   public IQICoreEncounter setAppointmentResource(Appointment param)
   {
      adaptedClass.getAppointment().setResource(param);
      return this;
   }

   public PeriodDt getPeriod()
   {
      return adaptedClass.getPeriod();
   }

   public IQICoreEncounter setPeriod(PeriodDt param)
   {
      adaptedClass.setPeriod(param);
      return this;
   }

   public QICoreEncounterAdapter getPartOfResource()
   {
      if (adaptedClass.getPartOf().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Encounter)
      {
         org.socraticgrid.fhir.generated.QICoreEncounterAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreEncounterAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Encounter) adaptedClass
                     .getPartOf().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreEncounter setPartOfResource(QICoreEncounterAdapter param)
   {
      adaptedClass.getPartOf().setResource(param.getAdaptee());
      return this;
   }

   public QICoreOrganizationAdapter getServiceProviderResource()
   {
      if (adaptedClass.getServiceProvider().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Organization)
      {
         org.socraticgrid.fhir.generated.QICoreOrganizationAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreOrganizationAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Organization) adaptedClass
                     .getServiceProvider().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreEncounter setServiceProviderResource(
         QICoreOrganizationAdapter param)
   {
      adaptedClass.getServiceProvider().setResource(param.getAdaptee());
      return this;
   }

   public CodeableConceptDt getPriority()
   {
      return adaptedClass.getPriority();
   }

   public IQICoreEncounter setPriority(CodeableConceptDt param)
   {
      adaptedClass.setPriority(param);
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

   public IQICoreEncounter setPatientResource(QICorePatientAdapter param)
   {
      adaptedClass.getPatient().setResource(param.getAdaptee());
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IQICoreEncounter setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IQICoreEncounter setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.EncounterStateEnum
                  .valueOf(param));
      return this;
   }

   public IQICoreEncounter setStatus(EncounterStateEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<EncounterStateEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IQICoreEncounter setStatus(BoundCodeDt<EncounterStateEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }
}