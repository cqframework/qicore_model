package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.resource.Communication;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.CommunicationRequest;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.CommunicationStatusEnum;
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
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IQICoreCommunication
{

   public Communication getAdaptee();

   public void setAdaptee(Communication param);

   public IdDt getId();

   public IQICoreCommunication setId(IdDt param);

   public List<Communication.Payload> getPayload();

   public IQICoreCommunication setPayload(List<Communication.Payload> param);

   public IQICoreCommunication addPayload(Communication.Payload param);

   public Communication.Payload addPayload();

   public Communication.Payload getPayloadFirstRep();

   public DateTimeDt getSentElement();

   public Date getSent();

   public IQICoreCommunication setSent(Date param);

   public IQICoreCommunication setSent(DateTimeDt param);

   public CommunicationRequest getRequestDetailResource();

   public IQICoreCommunication setRequestDetailResource(
         CommunicationRequest param);

   public QICoreEncounterAdapter getEncounterResource();

   public IQICoreCommunication setEncounterResource(
         QICoreEncounterAdapter param);

   public QICorePatientAdapter getSubjectResource();

   public IQICoreCommunication setSubjectResource(QICorePatientAdapter param);

   public ContainedDt getContained();

   public IQICoreCommunication setContained(ContainedDt param);

   public CodeableConceptDt getReasonNotPerformed();

   public IQICoreCommunication setReasonNotPerformed(CodeableConceptDt param);

   public CodeDt getLanguage();

   public IQICoreCommunication setLanguage(CodeDt param);

   public String getStatus();

   public IQICoreCommunication setStatus(String param);

   public IQICoreCommunication setStatus(CommunicationStatusEnum param);

   public BoundCodeDt<CommunicationStatusEnum> getStatusElement();

   public IQICoreCommunication setStatus(
         BoundCodeDt<CommunicationStatusEnum> param);

   public NarrativeDt getText();

   public IQICoreCommunication setText(NarrativeDt param);

   public List<IdentifierDt> getIdentifier();

   public IQICoreCommunication setIdentifier(List<IdentifierDt> param);

   public IQICoreCommunication addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public DateTimeDt getReceivedElement();

   public Date getReceived();

   public IQICoreCommunication setReceived(Date param);

   public IQICoreCommunication setReceived(DateTimeDt param);

   public CodeableConceptDt getCategory();

   public IQICoreCommunication setCategory(CodeableConceptDt param);
}