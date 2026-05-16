def validate_email(email):
    if "@" in email:
        return "valid email"

    if len(email)>= 8:
       return True

    return False
