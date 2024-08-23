

public class Banks {
    private int id;
    private String name;
    private String address;
    List<Code> code;

    
	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}
    
	public String getName() {
		return this.name;
	}

	public void setName (final String name) {
		this.name = name;
	}

    public String getAddress() {
		return this.address;
	}

	public void setAddress (final String address) {
		this.address = address;
	}

	public List<Code>  getCode() {
		return this.code;
	}

	public void getCode(final List<Code> code) {
		this.code = code;
	}
    


    @Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final LetterCredits rhs = (LetterCredits) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(id, rhs.id)
                    .append(id, rhs.name)
                    .append(id, rhs.address)
                    .append(id, rhs.code)
					.isEquals();
	}

	/**
	 * Returns a hash code value for the object.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.id)
            .append(this.name)
            .append(this.address)
            .append(this.code)
			.toHashCode();
	}

	/**
	 * Returns a string representation of the object.
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("id", id)
            .append("name", name)
            .append("address", address)
            .append("code", code)
			.toString();
	}
 
}

