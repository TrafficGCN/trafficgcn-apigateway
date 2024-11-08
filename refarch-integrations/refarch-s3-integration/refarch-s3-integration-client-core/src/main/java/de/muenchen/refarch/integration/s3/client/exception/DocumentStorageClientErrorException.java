package de.muenchen.refarch.integration.s3.client.exception;

@SuppressWarnings("PMD.MissingSerialVersionUID")
public class DocumentStorageClientErrorException extends Exception {
    public DocumentStorageClientErrorException(final String message, final Exception exception) {
        super(message, exception);
    }

}
