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
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
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
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface ICommunication
{

   public Communication getAdaptee();

   public void setAdaptee(Communication param);

   public IdDt getId();

   public ICommunication setId(IdDt param);

   public List<Communication.Payload> getPayload();

   public ICommunication setPayload(List<Communication.Payload> param);

   public ICommunication addPayload(Communication.Payload param);

   public Communication.Payload addPayload();

   public Communication.Payload getPayloadFirstRep();

   public DateTimeDt getSentElement();

   public Date getSent();

   public ICommunication setSent(Date param);

   public ICommunication setSent(DateTimeDt param);

   public CommunicationRequest getRequestDetailResource();

   public ICommunication setRequestDetailResource(CommunicationRequest param);

   public Encounter getEncounterResource();

   public ICommunication setEncounterResource(Encounter param);

   public Patient getSubjectResource();

   public ICommunication setSubjectResource(Patient param);

   public ContainedDt getContained();

   public ICommunication setContained(ContainedDt param);

   public CodeDt getLanguage();

   public ICommunication setLanguage(CodeDt param);

   public String getStatus();

   public ICommunication setStatus(String param);

   public ICommunication setStatus(CommunicationStatusEnum param);

   public BoundCodeDt<CommunicationStatusEnum> getStatusElement();

   public ICommunication setStatus(BoundCodeDt<CommunicationStatusEnum> param);

   public NarrativeDt getText();

   public ICommunication setText(NarrativeDt param);

   public List<IdentifierDt> getIdentifier();

   public ICommunication setIdentifier(List<IdentifierDt> param);

   public ICommunication addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public DateTimeDt getReceivedElement();

   public Date getReceived();

   public ICommunication setReceived(Date param);

   public ICommunication setReceived(DateTimeDt param);

   public CodeableConceptDt getCategory();

   public ICommunication setCategory(CodeableConceptDt param);
}