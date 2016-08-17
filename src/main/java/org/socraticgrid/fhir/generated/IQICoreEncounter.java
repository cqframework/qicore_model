package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.EncounterClassEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import org.socraticgrid.fhir.generated.QICoreEncounterRelatedCondition;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.DurationDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Appointment;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.EncounterStateEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IQICoreEncounter
{

   public Encounter getAdaptee();

   public void setAdaptee(Encounter param);

   public String getClassElement();

   public IQICoreEncounter setClassElement(String param);

   public IQICoreEncounter setClassElement(EncounterClassEnum param);

   public BoundCodeDt<EncounterClassEnum> getClassElementElement();

   public IQICoreEncounter setClassElement(
         BoundCodeDt<EncounterClassEnum> param);

   public NarrativeDt getText();

   public IQICoreEncounter setText(NarrativeDt param);

   public List<IdentifierDt> getIdentifier();

   public IQICoreEncounter setIdentifier(List<IdentifierDt> param);

   public IQICoreEncounter addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public Encounter.Hospitalization getHospitalization();

   public IQICoreEncounter setHospitalization(Encounter.Hospitalization param);

   public List<QICoreEncounterRelatedCondition> getRelatedCondition();

   public IQICoreEncounter setRelatedCondition(
         List<QICoreEncounterRelatedCondition> param);

   public CodeableConceptDt getReasonCancelled();

   public IQICoreEncounter setReasonCancelled(CodeableConceptDt param);

   public List<Encounter.Participant> getParticipant();

   public IQICoreEncounter setParticipant(List<Encounter.Participant> param);

   public IQICoreEncounter addParticipant(Encounter.Participant param);

   public Encounter.Participant addParticipant();

   public Encounter.Participant getParticipantFirstRep();

   public List<Encounter.StatusHistory> getStatusHistory();

   public IQICoreEncounter setStatusHistory(List<Encounter.StatusHistory> param);

   public IQICoreEncounter addStatusHistory(Encounter.StatusHistory param);

   public Encounter.StatusHistory addStatusHistory();

   public Encounter.StatusHistory getStatusHistoryFirstRep();

   public ContainedDt getContained();

   public IQICoreEncounter setContained(ContainedDt param);

   public CodeDt getLanguage();

   public IQICoreEncounter setLanguage(CodeDt param);

   public DurationDt getLength();

   public IQICoreEncounter setLength(DurationDt param);

   public List<Encounter.Location> getLocation();

   public IQICoreEncounter setLocation(List<Encounter.Location> param);

   public IQICoreEncounter addLocation(Encounter.Location param);

   public Encounter.Location addLocation();

   public Encounter.Location getLocationFirstRep();

   public Appointment getAppointmentResource();

   public IQICoreEncounter setAppointmentResource(Appointment param);

   public PeriodDt getPeriod();

   public IQICoreEncounter setPeriod(PeriodDt param);

   public QICoreEncounterAdapter getPartOfResource();

   public IQICoreEncounter setPartOfResource(QICoreEncounterAdapter param);

   public QICoreOrganizationAdapter getServiceProviderResource();

   public IQICoreEncounter setServiceProviderResource(
         QICoreOrganizationAdapter param);

   public CodeableConceptDt getPriority();

   public IQICoreEncounter setPriority(CodeableConceptDt param);

   public QICorePatientAdapter getPatientResource();

   public IQICoreEncounter setPatientResource(QICorePatientAdapter param);

   public IdDt getId();

   public IQICoreEncounter setId(IdDt param);

   public String getStatus();

   public IQICoreEncounter setStatus(String param);

   public IQICoreEncounter setStatus(EncounterStateEnum param);

   public BoundCodeDt<EncounterStateEnum> getStatusElement();

   public IQICoreEncounter setStatus(BoundCodeDt<EncounterStateEnum> param);
}