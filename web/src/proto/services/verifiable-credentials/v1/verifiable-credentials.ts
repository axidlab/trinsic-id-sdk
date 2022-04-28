/* eslint-disable */
import Long from "long";
import * as _m0 from "protobufjs/minimal";

export interface IssueRequest {
  documentJson: string;
}

export interface IssueResponse {
  signedDocumentJson: string;
}

export interface IssueFromTemplateRequest {
  templateId: string;
  valuesJson: string;
}

export interface IssueFromTemplateResponse {
  documentJson: string;
}

/** Create Proof */
export interface CreateProofRequest {
  /**
   * Optional document that describes which fields should be
   * revealed in the generated proof. If specified, this document must be
   * a valid JSON-LD frame.
   * If this field is not specified, a default reveal document will be
   * used and all fields in the signed document will be revealed
   */
  revealDocumentJson: string;
  /**
   * The item identifier that contains a record with a verifiable
   * credential to be used for generating the proof.
   */
  itemId: string | undefined;
  /**
   * A document that contains a valid verifiable credential with an
   * unbound signature. The proof will be derived from this document
   * directly. The document will not be stored in the wallet.
   */
  documentJson: string | undefined;
}

export interface CreateProofResponse {
  proofDocumentJson: string;
}

/** Verify Proof */
export interface VerifyProofRequest {
  proofDocumentJson: string;
}

export interface VerifyProofResponse {
  /** Indicates if the proof is valid */
  isValid: boolean;
  /** @deprecated */
  validationMessages: string[];
  /**
   * Validation messages that describe invalid verifications
   * based on different factors, such as schema validation,
   * proof verification, revocation registry membership, etc.
   * If the proof is not valid, this field will contain detailed
   * results where this verification failed.
   */
  validationResults: { [key: string]: ValidationMessage };
}

export interface VerifyProofResponse_ValidationResultsEntry {
  key: string;
  value: ValidationMessage | undefined;
}

/** validation message that contains results and error messages */
export interface ValidationMessage {
  /** the validation result */
  isValid: boolean;
  /** set of messages that contain validation results */
  messages: string[];
}

export interface SendRequest {
  email: string | undefined;
  didUri: string | undefined;
  didcommInvitationJson: string | undefined;
  documentJson: string;
}

export interface SendResponse {}

/** request object to update the status of the revocation entry */
export interface UpdateStatusRequest {
  /** the credential status id */
  credentialStatusId: string;
  /** indicates if the status is revoked */
  revoked: boolean;
}

/** response object for update of status of revocation entry */
export interface UpdateStatusResponse {}

/** request object to check the status of the revocation entry */
export interface CheckStatusRequest {
  /** the credential status id */
  credentialStatusId: string;
}

/** response object for checking the status of revocation entry */
export interface CheckStatusResponse {
  /** indicates if the status is revoked */
  revoked: boolean;
}

function createBaseIssueRequest(): IssueRequest {
  return { documentJson: "" };
}

export const IssueRequest = {
  encode(
    message: IssueRequest,
    writer: _m0.Writer = _m0.Writer.create()
  ): _m0.Writer {
    if (message.documentJson !== "") {
      writer.uint32(10).string(message.documentJson);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): IssueRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseIssueRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.documentJson = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromPartial(object: DeepPartial<IssueRequest>): IssueRequest {
    const message = createBaseIssueRequest();
    message.documentJson = object.documentJson ?? "";
    return message;
  },
};

function createBaseIssueResponse(): IssueResponse {
  return { signedDocumentJson: "" };
}

export const IssueResponse = {
  encode(
    message: IssueResponse,
    writer: _m0.Writer = _m0.Writer.create()
  ): _m0.Writer {
    if (message.signedDocumentJson !== "") {
      writer.uint32(10).string(message.signedDocumentJson);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): IssueResponse {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseIssueResponse();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.signedDocumentJson = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromPartial(object: DeepPartial<IssueResponse>): IssueResponse {
    const message = createBaseIssueResponse();
    message.signedDocumentJson = object.signedDocumentJson ?? "";
    return message;
  },
};

function createBaseIssueFromTemplateRequest(): IssueFromTemplateRequest {
  return { templateId: "", valuesJson: "" };
}

export const IssueFromTemplateRequest = {
  encode(
    message: IssueFromTemplateRequest,
    writer: _m0.Writer = _m0.Writer.create()
  ): _m0.Writer {
    if (message.templateId !== "") {
      writer.uint32(10).string(message.templateId);
    }
    if (message.valuesJson !== "") {
      writer.uint32(18).string(message.valuesJson);
    }
    return writer;
  },

  decode(
    input: _m0.Reader | Uint8Array,
    length?: number
  ): IssueFromTemplateRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseIssueFromTemplateRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.templateId = reader.string();
          break;
        case 2:
          message.valuesJson = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromPartial(
    object: DeepPartial<IssueFromTemplateRequest>
  ): IssueFromTemplateRequest {
    const message = createBaseIssueFromTemplateRequest();
    message.templateId = object.templateId ?? "";
    message.valuesJson = object.valuesJson ?? "";
    return message;
  },
};

function createBaseIssueFromTemplateResponse(): IssueFromTemplateResponse {
  return { documentJson: "" };
}

export const IssueFromTemplateResponse = {
  encode(
    message: IssueFromTemplateResponse,
    writer: _m0.Writer = _m0.Writer.create()
  ): _m0.Writer {
    if (message.documentJson !== "") {
      writer.uint32(10).string(message.documentJson);
    }
    return writer;
  },

  decode(
    input: _m0.Reader | Uint8Array,
    length?: number
  ): IssueFromTemplateResponse {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseIssueFromTemplateResponse();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.documentJson = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromPartial(
    object: DeepPartial<IssueFromTemplateResponse>
  ): IssueFromTemplateResponse {
    const message = createBaseIssueFromTemplateResponse();
    message.documentJson = object.documentJson ?? "";
    return message;
  },
};

function createBaseCreateProofRequest(): CreateProofRequest {
  return { revealDocumentJson: "", itemId: undefined, documentJson: undefined };
}

export const CreateProofRequest = {
  encode(
    message: CreateProofRequest,
    writer: _m0.Writer = _m0.Writer.create()
  ): _m0.Writer {
    if (message.revealDocumentJson !== "") {
      writer.uint32(10).string(message.revealDocumentJson);
    }
    if (message.itemId !== undefined) {
      writer.uint32(18).string(message.itemId);
    }
    if (message.documentJson !== undefined) {
      writer.uint32(26).string(message.documentJson);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): CreateProofRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseCreateProofRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.revealDocumentJson = reader.string();
          break;
        case 2:
          message.itemId = reader.string();
          break;
        case 3:
          message.documentJson = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromPartial(object: DeepPartial<CreateProofRequest>): CreateProofRequest {
    const message = createBaseCreateProofRequest();
    message.revealDocumentJson = object.revealDocumentJson ?? "";
    message.itemId = object.itemId ?? undefined;
    message.documentJson = object.documentJson ?? undefined;
    return message;
  },
};

function createBaseCreateProofResponse(): CreateProofResponse {
  return { proofDocumentJson: "" };
}

export const CreateProofResponse = {
  encode(
    message: CreateProofResponse,
    writer: _m0.Writer = _m0.Writer.create()
  ): _m0.Writer {
    if (message.proofDocumentJson !== "") {
      writer.uint32(10).string(message.proofDocumentJson);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): CreateProofResponse {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseCreateProofResponse();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.proofDocumentJson = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromPartial(object: DeepPartial<CreateProofResponse>): CreateProofResponse {
    const message = createBaseCreateProofResponse();
    message.proofDocumentJson = object.proofDocumentJson ?? "";
    return message;
  },
};

function createBaseVerifyProofRequest(): VerifyProofRequest {
  return { proofDocumentJson: "" };
}

export const VerifyProofRequest = {
  encode(
    message: VerifyProofRequest,
    writer: _m0.Writer = _m0.Writer.create()
  ): _m0.Writer {
    if (message.proofDocumentJson !== "") {
      writer.uint32(10).string(message.proofDocumentJson);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): VerifyProofRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseVerifyProofRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.proofDocumentJson = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromPartial(object: DeepPartial<VerifyProofRequest>): VerifyProofRequest {
    const message = createBaseVerifyProofRequest();
    message.proofDocumentJson = object.proofDocumentJson ?? "";
    return message;
  },
};

function createBaseVerifyProofResponse(): VerifyProofResponse {
  return { isValid: false, validationMessages: [], validationResults: {} };
}

export const VerifyProofResponse = {
  encode(
    message: VerifyProofResponse,
    writer: _m0.Writer = _m0.Writer.create()
  ): _m0.Writer {
    if (message.isValid === true) {
      writer.uint32(8).bool(message.isValid);
    }
    for (const v of message.validationMessages) {
      writer.uint32(18).string(v!);
    }
    Object.entries(message.validationResults).forEach(([key, value]) => {
      VerifyProofResponse_ValidationResultsEntry.encode(
        { key: key as any, value },
        writer.uint32(26).fork()
      ).ldelim();
    });
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): VerifyProofResponse {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseVerifyProofResponse();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.isValid = reader.bool();
          break;
        case 2:
          message.validationMessages.push(reader.string());
          break;
        case 3:
          const entry3 = VerifyProofResponse_ValidationResultsEntry.decode(
            reader,
            reader.uint32()
          );
          if (entry3.value !== undefined) {
            message.validationResults[entry3.key] = entry3.value;
          }
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromPartial(object: DeepPartial<VerifyProofResponse>): VerifyProofResponse {
    const message = createBaseVerifyProofResponse();
    message.isValid = object.isValid ?? false;
    message.validationMessages = object.validationMessages?.map((e) => e) || [];
    message.validationResults = Object.entries(
      object.validationResults ?? {}
    ).reduce<{ [key: string]: ValidationMessage }>((acc, [key, value]) => {
      if (value !== undefined) {
        acc[key] = ValidationMessage.fromPartial(value);
      }
      return acc;
    }, {});
    return message;
  },
};

function createBaseVerifyProofResponse_ValidationResultsEntry(): VerifyProofResponse_ValidationResultsEntry {
  return { key: "", value: undefined };
}

export const VerifyProofResponse_ValidationResultsEntry = {
  encode(
    message: VerifyProofResponse_ValidationResultsEntry,
    writer: _m0.Writer = _m0.Writer.create()
  ): _m0.Writer {
    if (message.key !== "") {
      writer.uint32(10).string(message.key);
    }
    if (message.value !== undefined) {
      ValidationMessage.encode(
        message.value,
        writer.uint32(18).fork()
      ).ldelim();
    }
    return writer;
  },

  decode(
    input: _m0.Reader | Uint8Array,
    length?: number
  ): VerifyProofResponse_ValidationResultsEntry {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseVerifyProofResponse_ValidationResultsEntry();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.key = reader.string();
          break;
        case 2:
          message.value = ValidationMessage.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromPartial(
    object: DeepPartial<VerifyProofResponse_ValidationResultsEntry>
  ): VerifyProofResponse_ValidationResultsEntry {
    const message = createBaseVerifyProofResponse_ValidationResultsEntry();
    message.key = object.key ?? "";
    message.value =
      object.value !== undefined && object.value !== null
        ? ValidationMessage.fromPartial(object.value)
        : undefined;
    return message;
  },
};

function createBaseValidationMessage(): ValidationMessage {
  return { isValid: false, messages: [] };
}

export const ValidationMessage = {
  encode(
    message: ValidationMessage,
    writer: _m0.Writer = _m0.Writer.create()
  ): _m0.Writer {
    if (message.isValid === true) {
      writer.uint32(8).bool(message.isValid);
    }
    for (const v of message.messages) {
      writer.uint32(18).string(v!);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ValidationMessage {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseValidationMessage();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.isValid = reader.bool();
          break;
        case 2:
          message.messages.push(reader.string());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromPartial(object: DeepPartial<ValidationMessage>): ValidationMessage {
    const message = createBaseValidationMessage();
    message.isValid = object.isValid ?? false;
    message.messages = object.messages?.map((e) => e) || [];
    return message;
  },
};

function createBaseSendRequest(): SendRequest {
  return {
    email: undefined,
    didUri: undefined,
    didcommInvitationJson: undefined,
    documentJson: "",
  };
}

export const SendRequest = {
  encode(
    message: SendRequest,
    writer: _m0.Writer = _m0.Writer.create()
  ): _m0.Writer {
    if (message.email !== undefined) {
      writer.uint32(10).string(message.email);
    }
    if (message.didUri !== undefined) {
      writer.uint32(18).string(message.didUri);
    }
    if (message.didcommInvitationJson !== undefined) {
      writer.uint32(26).string(message.didcommInvitationJson);
    }
    if (message.documentJson !== "") {
      writer.uint32(802).string(message.documentJson);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SendRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseSendRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.email = reader.string();
          break;
        case 2:
          message.didUri = reader.string();
          break;
        case 3:
          message.didcommInvitationJson = reader.string();
          break;
        case 100:
          message.documentJson = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromPartial(object: DeepPartial<SendRequest>): SendRequest {
    const message = createBaseSendRequest();
    message.email = object.email ?? undefined;
    message.didUri = object.didUri ?? undefined;
    message.didcommInvitationJson = object.didcommInvitationJson ?? undefined;
    message.documentJson = object.documentJson ?? "";
    return message;
  },
};

function createBaseSendResponse(): SendResponse {
  return {};
}

export const SendResponse = {
  encode(
    _: SendResponse,
    writer: _m0.Writer = _m0.Writer.create()
  ): _m0.Writer {
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SendResponse {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseSendResponse();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromPartial(_: DeepPartial<SendResponse>): SendResponse {
    const message = createBaseSendResponse();
    return message;
  },
};

function createBaseUpdateStatusRequest(): UpdateStatusRequest {
  return { credentialStatusId: "", revoked: false };
}

export const UpdateStatusRequest = {
  encode(
    message: UpdateStatusRequest,
    writer: _m0.Writer = _m0.Writer.create()
  ): _m0.Writer {
    if (message.credentialStatusId !== "") {
      writer.uint32(10).string(message.credentialStatusId);
    }
    if (message.revoked === true) {
      writer.uint32(16).bool(message.revoked);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): UpdateStatusRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseUpdateStatusRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.credentialStatusId = reader.string();
          break;
        case 2:
          message.revoked = reader.bool();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromPartial(object: DeepPartial<UpdateStatusRequest>): UpdateStatusRequest {
    const message = createBaseUpdateStatusRequest();
    message.credentialStatusId = object.credentialStatusId ?? "";
    message.revoked = object.revoked ?? false;
    return message;
  },
};

function createBaseUpdateStatusResponse(): UpdateStatusResponse {
  return {};
}

export const UpdateStatusResponse = {
  encode(
    _: UpdateStatusResponse,
    writer: _m0.Writer = _m0.Writer.create()
  ): _m0.Writer {
    return writer;
  },

  decode(
    input: _m0.Reader | Uint8Array,
    length?: number
  ): UpdateStatusResponse {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseUpdateStatusResponse();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromPartial(_: DeepPartial<UpdateStatusResponse>): UpdateStatusResponse {
    const message = createBaseUpdateStatusResponse();
    return message;
  },
};

function createBaseCheckStatusRequest(): CheckStatusRequest {
  return { credentialStatusId: "" };
}

export const CheckStatusRequest = {
  encode(
    message: CheckStatusRequest,
    writer: _m0.Writer = _m0.Writer.create()
  ): _m0.Writer {
    if (message.credentialStatusId !== "") {
      writer.uint32(10).string(message.credentialStatusId);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): CheckStatusRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseCheckStatusRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.credentialStatusId = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromPartial(object: DeepPartial<CheckStatusRequest>): CheckStatusRequest {
    const message = createBaseCheckStatusRequest();
    message.credentialStatusId = object.credentialStatusId ?? "";
    return message;
  },
};

function createBaseCheckStatusResponse(): CheckStatusResponse {
  return { revoked: false };
}

export const CheckStatusResponse = {
  encode(
    message: CheckStatusResponse,
    writer: _m0.Writer = _m0.Writer.create()
  ): _m0.Writer {
    if (message.revoked === true) {
      writer.uint32(8).bool(message.revoked);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): CheckStatusResponse {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseCheckStatusResponse();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.revoked = reader.bool();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromPartial(object: DeepPartial<CheckStatusResponse>): CheckStatusResponse {
    const message = createBaseCheckStatusResponse();
    message.revoked = object.revoked ?? false;
    return message;
  },
};

export const VerifiableCredentialDefinition = {
  name: "VerifiableCredential",
  fullName: "services.verifiablecredentials.v1.VerifiableCredential",
  methods: {
    /**
     * Sign and issue a verifiable credential from a submitted document.
     * The document must be a valid JSON-LD document.
     */
    issue: {
      name: "Issue",
      requestType: IssueRequest,
      requestStream: false,
      responseType: IssueResponse,
      responseStream: false,
      options: {},
    },
    /**
     * Sign and issue a verifiable credential from a pre-defined template.
     * This process will also add schema validation and
     * revocation registry entry in the credential.
     */
    issueFromTemplate: {
      name: "IssueFromTemplate",
      requestType: IssueFromTemplateRequest,
      requestStream: false,
      responseType: IssueFromTemplateResponse,
      responseStream: false,
      options: {},
    },
    /** Check credential status in the revocation registry */
    checkStatus: {
      name: "CheckStatus",
      requestType: CheckStatusRequest,
      requestStream: false,
      responseType: CheckStatusResponse,
      responseStream: false,
      options: {},
    },
    /** Update credential status by setting the revocation value */
    updateStatus: {
      name: "UpdateStatus",
      requestType: UpdateStatusRequest,
      requestStream: false,
      responseType: UpdateStatusResponse,
      responseStream: false,
      options: {},
    },
    /**
     * Create a proof from a signed document that is a valid
     * verifiable credential and contains a signature from which a proof can be derived.
     */
    createProof: {
      name: "CreateProof",
      requestType: CreateProofRequest,
      requestStream: false,
      responseType: CreateProofResponse,
      responseStream: false,
      options: {},
    },
    /**
     * Verifies a proof by checking the signature value, and if possible schema validation,
     * revocation status, and issuer status against a trust registry
     */
    verifyProof: {
      name: "VerifyProof",
      requestType: VerifyProofRequest,
      requestStream: false,
      responseType: VerifyProofResponse,
      responseStream: false,
      options: {},
    },
    /** Sends a document directly to a user's email within the given ecosystem */
    send: {
      name: "Send",
      requestType: SendRequest,
      requestStream: false,
      responseType: SendResponse,
      responseStream: false,
      options: {},
    },
  },
} as const;

type Builtin =
  | Date
  | Function
  | Uint8Array
  | string
  | number
  | boolean
  | undefined;

type DeepPartial<T> = T extends Builtin
  ? T
  : T extends Array<infer U>
  ? Array<DeepPartial<U>>
  : T extends ReadonlyArray<infer U>
  ? ReadonlyArray<DeepPartial<U>>
  : T extends {}
  ? { [K in keyof T]?: DeepPartial<T[K]> }
  : Partial<T>;

if (_m0.util.Long !== Long) {
  _m0.util.Long = Long as any;
  _m0.configure();
}
