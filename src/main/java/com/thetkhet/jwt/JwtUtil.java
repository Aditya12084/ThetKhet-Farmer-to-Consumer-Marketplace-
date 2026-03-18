package com.thetkhet.jwt;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SecretKey;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;

public class JwtUtil {
	private static final SecretKey SECRETE_KEY = Keys.secretKeyFor(SignatureAlgorithm.HS256);

	private static final long TOKEN_VALIDITY = 24 * 60 * 60 * 1000;

	// To generate the token by taking username
	public static String generateToken(String username) {

		Map<String, Object> claims = new HashMap<>();

		return Jwts.builder().setClaims(claims).setSubject(username).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + TOKEN_VALIDITY))
				.signWith(SECRETE_KEY, SignatureAlgorithm.HS256).compact();
	}

	// validate token (token + username)
	public static boolean validateToken(String token) {
		final String extractedUsername = extractUsername(token);

		return (!isTokenExpired(token));

	}

	private static String extractUsername(String token) {

		return extractAllClaims(token).getSubject();
	}

	private static boolean isTokenExpired(String token) {
		return extractExpiration(token).before(new Date());
	}

	private static Date extractExpiration(String token) {

		return extractAllClaims(token).getExpiration();
	}

	private static Claims extractAllClaims(String token) {
		return Jwts.parser().setSigningKey(SECRETE_KEY).build().parseClaimsJws(token).getBody();

	}
}
